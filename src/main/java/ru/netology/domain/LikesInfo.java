package ru.netology.domain;

public class LikesInfo {

    private int likesCounter;
    private int id;
    private boolean canLike;

    public int getLikesCounter() {
        return likesCounter;
    }

    public void setLikesCounter(int likesCounter) {
        this.likesCounter = likesCounter;
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
}
