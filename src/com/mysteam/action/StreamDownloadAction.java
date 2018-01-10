package com.mysteam.action;

import com.mysteam.constant.GameState;
import com.mysteam.entity.Game;
import com.mysteam.entity.User;
import com.mysteam.service.StreamDownloadService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Map;

public class StreamDownloadAction extends ActionSupport {

    private String fileName;
    private Integer gameId;
    private Game game;
    private StreamDownloadService streamDownloadService;
    private String path = GameState.GAME_STORAGE_PATH;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public StreamDownloadService getStreamDownloadService() {
        return streamDownloadService;
    }

    public void setStreamDownloadService(StreamDownloadService streamDownloadService) {
        this.streamDownloadService = streamDownloadService;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setFileName(String fileName) throws Exception {
        if (ServletActionContext.getRequest().getMethod().equals("GET")) {
            byte[] bytes = fileName.getBytes("ISO8859-1");
            fileName = new String(bytes, "utf-8");
        }
        this.fileName = fileName;
    }

    public String getFileName() throws Exception {
        return URLEncoder.encode(fileName, "utf-8");
    }

    public InputStream getFileStream() throws Exception {
        fileName="1.rar";
        InputStream inputStream = ServletActionContext.getServletContext().getResourceAsStream("1.rar");//path + "id_"+gameId + "/" + fileName + ".rar");
        return inputStream;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        User a = new User();
        a.setUserId(1);
        a.setAccount("zjut");
        a.setPassword("zjut");
        session.put("user", a);

        User user = (User) session.get("user");
        game = streamDownloadService.downloadByUIdNGId(user.getUserId(), gameId);
        setFileName(game.getGameName());
        return SUCCESS;
    }
}