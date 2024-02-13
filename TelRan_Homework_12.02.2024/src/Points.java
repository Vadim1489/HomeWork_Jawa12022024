class Points {

    private int score;

    public Points(String name) {

        this.score = 0;
    }

    public Points () {
        score = 0;
    }

    public void pointsAdding() {
        score = score + 5;
    }

    public void pointsDeducting() {
        score = score - 5;
    }

    public int pointsTotal() {
        return score;
    }
}