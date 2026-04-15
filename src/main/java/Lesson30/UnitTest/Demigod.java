package Lesson30.UnitTest;

public class Demigod {
    private String name;
    private String godParent;
    private int age;

    public Demigod(String name, String godParent, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Navn må ikke være tomt");
        }
        if (godParent == null || godParent.isEmpty()) {
            throw new IllegalArgumentException("Gudeforælder må ikke være tom");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Alder må ikke være negativ");
        }

        this.name = name;
        this.godParent = godParent;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGodParent() {
        return godParent;
    }

    public int getAge() {
        return age;
    }

    public boolean isEligibleForQuest() {
        return age >= 12;
    }

    public String getCampCabin() {
        switch (godParent.toLowerCase()) {
            case "poseidon": return "Cabin 3";
            case "zeus": return "Cabin 1";
            case "athena": return "Cabin 6";
            default: return "Unknown Cabin";
        }
    }
}
