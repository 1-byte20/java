package palindrom;

public class Palindrom {

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false; // Null érték esetén false-t ad vissza
        }

        // A karakterek kis- és nagybetű különbségét figyelmen kívül hagyjuk
        String sanitizedInput = input.toLowerCase();

        // Két mutatóval végzett ellenőrzés
        int left = 0;
        int right = sanitizedInput.length() - 1;

        while (left < right) {
            if (sanitizedInput.charAt(left) != sanitizedInput.charAt(right)) {
                return false; // Ha bármelyik pár nem egyezik, nem palindróm
            }
            left++;
            right--;
        }

        return true; // Ha végig ellenőriztük és minden egyezik, palindróm
    }
}
