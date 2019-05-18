public class Main {

    public static void main(String[] args) {

        Fitness exercise1 = new Fitness("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, "floor");
        Fitness exercise2 = new Fitness("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "floor");
        Fitness exercise3 = new Fitness("Sqauts", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, "standup");
        Fitness exercise4 = new Fitness("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, "floor");
        Fitness exercise5 = new Fitness("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, "standup");
        Fitness exercise6 = new Fitness("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, "standup");

        System.out.println(exercise1.getExerciseName() + "    " + "DURATION: " + exercise1.getDurationinsec() + ".");
        System.out.println("--------------------------");
        System.out.println("DESCRIPTION: " + exercise1.getDescription());

        System.out.println(exercise2.getExerciseName() + "    " + "DURATION: " + exercise2.getDurationinsec() + ".");
        System.out.println("--------------------------");
        System.out.println("DESCRIPTION: " + exercise2.getDescription());

        System.out.println(exercise3.getExerciseName() + "    " + "DURATION: " + exercise3.getDurationinsec() + ".");
        System.out.println("--------------------------");
        System.out.println("DESCRIPTION: " + exercise3.getDescription());

        System.out.println(exercise4.getExerciseName() + "    " + "DURATION: " + exercise4.getDurationinsec() + ".");
        System.out.println("--------------------------");
        System.out.println("DESCRIPTION: " + exercise4.getDescription());

        System.out.println(exercise5.getExerciseName() + "    " + "DURATION: " + exercise5.getDurationinsec() + ".");
        System.out.println("--------------------------");
        System.out.println("DESCRIPTION: " + exercise5.getDescription());

        System.out.println(exercise6.getExerciseName() + "    " + "DURATION: " + exercise6.getDurationinsec() + ".");
        System.out.println("--------------------------");
        System.out.println("DESCRIPTION: " + exercise6.getDescription());


       /* String[] exerciseName = {"Push-ups", "Planks", "Sqauts", "Backward Kick", "Leg Curl", "Sidewards Back Stretch"};
        int [] exerciseDuration = {30,90,45,60,90,60};
        String [] position = {"floor", "floor", "standup", "floor", "standup", "standup"};



        for (int i = 0; i < exerciseName.length; i++ && int j = 0; j < exerciseDuration; j++ && int k = 0; k < position.length; k++) {
            System.out.println(exerciseName[i] + "    " + "DURATION: " + exerciseDuration[j] + ".");
            System.out.println("--------------------------");
            System.out.println("DESCRIPTION: " + position[k]);*/
        }


}



