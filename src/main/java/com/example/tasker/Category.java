package com.example.tasker;

public enum Category {

    HOME("obowiazki domowe"), WORK("obowiazki zawodowe"), HOBBY("hobby");

    private String showCategory;

    Category(String showCategory) {
        this.showCategory = showCategory;
    }

    public String getShowCategory() {
        return showCategory;
    }
}
