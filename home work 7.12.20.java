    // 1. input two int numbers from the user, check if they are both zeros, if so print "both zeroes" otherwise print "not both zeroes"
    
        Scanner s = new Scanner(System.in);
        System.out.println("enter two int numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("both zeroes ");
        } else {
            System.out.println("not both zeroes ");
        }

        System.out.println("The program is ended..");
    }

    //2. input a,b,c (int)
    // check if all numbers are different from each-other, if so print "diff" otherwise print "similar"

        System.out.println("enter three int numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a != b && a != c && b != c) {
            System.out.println("diff");
        } else {
            System.out.println("similar");
        }
        System.out.println("The program is ended..");
    }


        //  3. input x,y,z (float)
        // check and print how many of them are positive
        //  for example:
        //   for input of -1, 4 ,2.98 your program should print 2 positive numbers
        //   for input of -4.5, 0, -12 your program should print 0 positive numbers

     System.out.println("enter three float numbers: ");
        float x = s.nextFloat();
        float y = s.nextFloat();
        float z = s.nextFloat();
        if (x > 0 )
            System.out.println(x);
         if (y > 0 )
            System.out.println(y);
        if (z > 0 )
            System.out.println(z);
        else
            System.out.println(" 0 positive numbers ");
    


        // 4. input a, b, c.
        //  print the biggest
        // hint: if a is bigger than b and bigger than c --> a biggest
        //    else if b is bigger than c --> b biggest
        //    else --> c biggest} System.out.println("enter three int numbers: ");

        System.out.println("enter three int numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b && a > c)
            System.out.println("The biggest is:"+ " " + a);
        else if (b > c)
            System.out.println("The biggest is:"+ " " + b);
        else
            System.out.println("The biggest is:"+ " " + c);
    
