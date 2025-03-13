package model;



public class Exercise {
    
    private String exerciseId;
    private String exerciseName;
    private String targetMuscleGroup;  //cac nhom co muc tieu 
    private int sets; //set
    private int repetitions; //so lan lap
    private int duration;  //thoi gian (giay)
    private String equipment;  //thiet bi ho tro

    // Constructor
    public Exercise(String exerciseId, String exerciseName, String targetMuscleGroup, int sets, int repetitions, int durationInSeconds, String equipmentNeeded) {
        this.exerciseId = exerciseId;
        this.exerciseName = exerciseName;
        this.targetMuscleGroup = targetMuscleGroup;
        this.sets = sets;
        this.repetitions = repetitions;
        this.duration = durationInSeconds;
        this.equipment = equipmentNeeded;
    }

    // Getters and Setters

    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }
    
    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getTargetMuscleGroup() {
        return targetMuscleGroup;
    }

    public void setTargetMuscleGroup(String targetMuscleGroup) {
        this.targetMuscleGroup = targetMuscleGroup;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int durationInSeconds) {
        this.duration = durationInSeconds;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipmentNeeded) {
        this.equipment = equipmentNeeded;
    }

    public void displayExercise() {
        System.out.println("Exercise: " + exerciseName);
        System.out.println("Target Muscle Group: " + targetMuscleGroup);
        System.out.println("Sets: " + sets + ", Repetitions: " + repetitions);
        if (duration > 0) {
            System.out.println("Duration: " + duration + " seconds");
        }
        if (!equipment.isEmpty()) {
            System.out.println("Equipment Needed: " + equipment);
        }
    }
}
