package ru.netology.domain;

public class LikesInfo {

    private int count;
    private int id;
    private boolean userLikesInfo;
    private boolean canLike;
    public boolean  canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isUserLikesInfo() {
        return userLikesInfo;
    }

    public void setUserLikesInfo(boolean userLikesInfo) {
        this.userLikesInfo = userLikesInfo;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
