public class Fitness {

    private String exerciseName;
    private String description;
    private int durationinsec;
    private String position;

    public Fitness(String exerciseName, String description, int durationinsec, String position){

        this.exerciseName = exerciseName;
        this.description = description;
        this.durationinsec = durationinsec;
        this.position = position;
    }

    public String getExerciseName (){
        return exerciseName;
    }

    public void setExerciseName(String exerciseName){
        this.exerciseName = exerciseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getDurationinsec(){
        return durationinsec;
    }
    public void setDurationinsec(int durationinsec){
        this.durationinsec = durationinsec;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
}

