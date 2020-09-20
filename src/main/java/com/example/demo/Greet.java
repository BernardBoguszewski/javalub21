package com.example.demo;

public class Greet {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (name.matches(".*\\d.*")) {
            return "Z liczbami się nie witam.";
        }
        if (name.equals(name.toUpperCase())) {
            return String.format("WITAJ %s!", name);
        }
        String[] names = name.split(",");
        if (names.length == 2) {
            return name.substring(0, name.indexOf(",")) + " i " + name.substring(name.indexOf(",") + 1) + ", witajcie!";
        } else if (names.length == 3) {
            int elementsInUpeerCase = 0;
            int indexOfUpperElement = 0;
            for (String element : names) {
                indexOfUpperElement++;
                if (element.equals(element.toUpperCase())) {
                    elementsInUpeerCase++;
                }
            }
            if (elementsInUpeerCase == 1) {
                String msg = null;
                switch (indexOfUpperElement) {
                    case 1:
                        msg = names[1] + " i " + names[2] + ", witajcie! WITAJ " + names[0];
                        break;
                    case 2:
                        msg = names[0] + " i " + names[2] + ", witajcie! WITAJ " + names[1];
                        break;
                    case 3:
                        msg = names[0] + " i " + names[1] + ", witajcie! WITAJ " + names[2];
                        break;
                }
                return msg + "!";
            }
            return names[0] + ", " + names[1] + " i " + names[2] + ", witajcie!";
        }
        return String.format("Witaj, %s", name);
    }
}
