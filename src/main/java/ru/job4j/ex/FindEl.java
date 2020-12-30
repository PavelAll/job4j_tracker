package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element Not found exception");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] obuses) throws ElementAbuseException {
        for (int i = 0; i < obuses.length; i++) {
            if (obuses[i].equals(value)) {
                throw new ElementAbuseException(
                        "The key is included in the keys of prohibited keys"
                );
            }
        }
        return true;
    }

    public static void process(String[] value, String key, String[] obuses) {
        try {
            if (indexOf(value, key) != -1) {
                sent(key, obuses);
                System.out.println("Cooбщение отправлено благополучно");
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] value = {"Ivan", "Maksim", "Vladimir", "Egor"};
        String[] obuses = {"key1", "key2", "Ivan", "key4"};
        String key = "Ivan";
        process(value, key, obuses);
    }
}
