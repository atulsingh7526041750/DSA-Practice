package interview;

import java.util.*;

class Result {

    public static void main(String[] args) {
        // Sample 3x3 image input
        List<List<Integer>> image = new ArrayList<>();
        image.add(Arrays.asList(1, 0, 0));
        image.add(Arrays.asList(0, 1, 0));
        image.add(Arrays.asList(0, 0, 1));

        int rotation = 90;         // Rotate 90 degrees clockwise
        int verticalFlip = 1;      // Flip vertically
        int horizontalFlip = 1;    // Flip horizontally

        List<List<Integer>> result = getFinalImage(image, rotation, verticalFlip, horizontalFlip);

        // Print output
        System.out.println("Final Image:");
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> getFinalImage(List<List<Integer>> image, int rotation, int verticalFlip, int horizontalFlip) {
        // Step 1: Rotation
        image = rotateImage(image, rotation);

        // Step 2: Vertical Flip
        if (verticalFlip == 1) {
            image = verticalFlip(image);
        }

        // Step 3: Horizontal Flip
        if (horizontalFlip == 1) {
            image = horizontalFlip(image);
        }

        return image;
    }

    private static List<List<Integer>> rotateImage(List<List<Integer>> image, int rotation) {
        int n = image.size();
        List<List<Integer>> rotated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rotated.add(new ArrayList<>(Collections.nCopies(n, 0)));
        }

        if (rotation == 90) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated.get(j).set(n - 1 - i, image.get(i).get(j));
                }
            }
        } else if (rotation == 180) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated.get(n - 1 - i).set(n - 1 - j, image.get(i).get(j));
                }
            }
        } else if (rotation == 270) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated.get(n - 1 - j).set(i, image.get(i).get(j));
                }
            }
        } else {
            rotated = image; // No rotation
        }

        return rotated;
    }

    private static List<List<Integer>> verticalFlip(List<List<Integer>> image) {
        int n = image.size();
        List<List<Integer>> flipped = new ArrayList<>(image);
        for (int i = 0; i < n / 2; i++) {
            List<Integer> temp = flipped.get(i);
            flipped.set(i, flipped.get(n - 1 - i));
            flipped.set(n - 1 - i, temp);
        }
        return flipped;
    }

    private static List<List<Integer>> horizontalFlip(List<List<Integer>> image) {
        int n = image.size();
        for (List<Integer> row : image) {
            for (int i = 0; i < n / 2; i++) {
                int temp = row.get(i);
                row.set(i, row.get(n - 1 - i));
                row.set(n - 1 - i, temp);
            }
        }
        return image;
    }
}
