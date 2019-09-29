package seedu.address.model.entity;

public enum PrefixType {
    P, // Participant
    M, // Mentor
    T, // Team
    I; // Issue

    public String toStorageValue() {
        return this.name();
    }

    public static boolean isValidPrefix(String test) {
        try {
            PrefixType result = PrefixType.valueOf(test);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}