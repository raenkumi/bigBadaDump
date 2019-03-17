for (int i = 2; i < (number / 2 + 1); i++) {
            System.out.println(i);
            if (isPrime) {
                i = number;
            } else if (number % i == 0) {
                isPrime = true;
            }
        }
        return isPrime;