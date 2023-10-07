class Main {
    public static void main(String args[])
    {
        OliphauntPool pool = new OliphauntPool();
        Oliphaunt oliphaunt1 = pool.checkOut();
        System.out.println(oliphaunt1.toString());
        Oliphaunt oliphaunt2 = pool.checkOut();
        System.out.println(oliphaunt2.toString());
        Oliphaunt oliphaunt3 = pool.checkOut();
        System.out.println(oliphaunt3.toString());
        pool.checkIn(oliphaunt1);
        pool.checkIn(oliphaunt2);
        Oliphaunt oliphaunt4 = pool.checkOut();
        System.out.println(oliphaunt4.toString());
        Oliphaunt oliphaunt5 = pool.checkOut();
        System.out.println(oliphaunt5.toString());
    }
} 