package com.example.tasker;

public enum Category {

    HOME("Obowiązki domowe"), WORK("Obowiązki zawodowe"), HOBBY("Hobby");

    private String showCategory;

    Category(String showCategory) {
        this.showCategory = showCategory;
    }

    public String getShowCategory() {
        return showCategory;
    }
}
