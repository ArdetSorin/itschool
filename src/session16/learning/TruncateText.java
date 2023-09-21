package session16.learning;

@FunctionalInterface
public interface TruncateText {

    String truncate(String input, int maxLength);
}