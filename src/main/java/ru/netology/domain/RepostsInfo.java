package ru.netology.domain;

public class RepostsInfo {

    private int repostsCounter;
    private int id;
    private int ownerId;
    private boolean canRepost;

    public int getRepostsCounter() {
        return repostsCounter;
    }

    public void setRepostsCounter(int repostsCounter) {
        this.repostsCounter = repostsCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

}
