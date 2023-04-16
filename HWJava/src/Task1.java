class main(String[] args)
        {
        System.out.println("Hello world!");
        Scanner readTerminal = new Scanner(System.in);
        System.out.print("n: ");
        int n = readTerminal.nextInt();
        int res = (n*(n+1))/2;
        System.out.print(res);

        readTerminal.close();
        }
