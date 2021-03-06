package by.itAcademy.homeworks.objects;

public class TheTimer implements Comparable<TheTimer> {

        private int seconds;
        private int minutes;
        private int hours;

        public TheTimer(int seconds) {
            this.hours = seconds / 3600;
            this.minutes = (seconds % 3600) / 60;
            this.seconds = (seconds % 3600) % 60;
        }

        public TheTimer(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;

        }

        public int getNumberOfSeconds() {
            return hours * 3600 + minutes * 60 + seconds;
        }

        public int compareTo(by.itAcademy.homeworks.objects.TheTimer object) {
            Integer a = this.getNumberOfSeconds();
            return a.compareTo(object.getNumberOfSeconds());
        }

        public void timePrint() {
            System.out.println("Time " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
            System.out.println("Total seconds : " + getNumberOfSeconds());
        }

    }

