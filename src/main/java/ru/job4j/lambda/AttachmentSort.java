package ru.job4j.lambda;

import java.util.*;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };

        attachments.sort(comparator);
        System.out.println(attachments);

        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        list.add(100500);

        comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };

        attachments.sort(comparator);
        System.out.println(attachments);

        Attachment[] atts = {
                new Attachment("Image 1", 20),
                new Attachment("Image 3", 120),
                new Attachment("Image 2", 23)
        };
        Comparator<Attachment> comp = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(atts, comp);
        System.out.println(Arrays.toString(atts));
    }
}
