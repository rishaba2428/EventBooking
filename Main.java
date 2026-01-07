import java.util.Scanner;
public class Main
{
    public static void main (String[]args) {
        User user1 = new User();
        User user2 = new User();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter user eventType");
        String eventType1 = sc.nextLine();
        user1.setEventType(eventType1);
        System.out.println("Enter Number of Seats:");
        Integer seat1 = new Integer(sc.nextLine());
        user1.setNumberOfSeats(seat1.intValue());


        if (user1.getEventType().equals("normal")) {
            System.out.println("seats available:");
            int[][] ord = new int[4][3];
            ord[0] = new int[]{1, 2, 3};
            for (int i = 0; i < ord.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }


                for (int j = 0; j < ord[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print(" ");
                    }
                    System.out.print(ord[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < user1.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadBooked = false;
                while (!isValidSeat || !isAlreadBooked) {
                    try {
                        System.out.println("Enter the seats:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        Integer seats = new Integer(String.valueOf(ch[1]));//to target the index value when 0 and ...
                        int finalSeats = seats - 1;//getting value in int then calculating
                        if (ord[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                            isAlreadBooked = true;
                            System.out.println("This seat is already Booked");
                        }
                        ord[finalRow + 1][finalSeats] = 1;
                        isValidSeat = true;
                        isAlreadBooked = true;//saying it is correct
                    } catch (Exception e) {
                        System.out.println("Invalid seat ,please enter valid seat");
                        isValidSeat = false;//saying it is wrong
                    }
                }
            }

            OrdinaryEvent ordinary = new OrdinaryEvent();
            ordinary.setEventId(12);
            System.out.println("event id:");
            user1.setEventId(ordinary.getEventId());
            System.out.println(user1.getEventId());
            ordinary.register();

        } else {

            System.out.println("seats available:");
            int[][] ord = new int[4][3];
            ord[0] = new int[]{1, 2, 3};
            for (int i = 0; i < ord.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }


                for (int j = 0; j < ord[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print(" ");
                    }
                    System.out.print(ord[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < user1.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadBooked = false;
                while (!isValidSeat || !isAlreadBooked) {
                    try {
                        System.out.println("Enter the seats:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        Integer seats = new Integer(String.valueOf(ch[1]));//to target the index value when 0 and ...
                        int finalSeats = seats - 1;//getting value in int then calculating
                        if (ord[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                            isAlreadBooked = true;
                            System.out.println("This seat is already Booked");
                        }
                        ord[finalRow + 1][finalSeats] = 1;
                        isValidSeat = true;
                        isAlreadBooked = true;//saying it is correct
                    } catch (Exception e) {
                        System.out.println("Invalid seat ,please enter valid seat");
                        isValidSeat = false;//saying it is wrong
                    }
                }
            }
                System.out.println("Enter Number of Seats:");
                VipEvent vip = new VipEvent();
                vip.setEventId(14);
                System.out.println("event id:");
                user2.setEventId(vip.getEventId());
                System.out.println(user2.getEventId());
                vip.register();
            }


            System.out.println("enter user eventType");
            String eventType2 = sc.nextLine();
            user2.setEventType(eventType2);


            if (user2.getEventType().equals("vip")) {
                System.out.println("seats available:");
                int[][] vipevent = new int[4][3];
                vipevent[0] = new int[]{1, 2, 3};
                for (int i = 0; i < vipevent.length; i++) {
                    if (i != 0) {
                        System.out.print((char) (65 + i - 1));
                        System.out.print(" ");
                    }


                    for (int j = 0; j < vipevent[i].length; j++) {
                        if (i == 0 && j == 0) {
                            System.out.print(" ");
                        }
                        System.out.print(vipevent[i][j] + " ");
                    }
                    System.out.println();
                }
                for (int i = 0; i < user1.getNumberOfSeats(); i++) {
                    boolean isValidSeat = false;
                    boolean isAlreadBooked = false;
                    while (!isValidSeat || !isAlreadBooked) {
                        try {
                            System.out.println("Enter the seats:");
                            String row = sc.nextLine();
                            char[] ch = row.toCharArray();
                            int finalRow = ch[0] - 65;
                            Integer seats = new Integer(String.valueOf(ch[1]));//to target the index value when 0 and ...
                            int finalSeats = seats - 1;//getting value in int then calculating
                            if (vipevent[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                                isAlreadBooked = true;
                                System.out.println("This seat is already Booked");
                            }
                            vipevent[finalRow + 1][finalSeats] = 1;
                            isValidSeat = true;
                            isAlreadBooked = true;//saying it is correct
                        } catch (Exception e) {
                            System.out.println("Invalid seat ,please enter valid seat");
                            isValidSeat = false;//saying it is wrong
                        }
                    }}

                    VipEvent vip = new VipEvent();
                    vip.setEventId(122);
                    System.out.println("event id:");
                    user2.setEventId(vip.getEventId());
                    System.out.println(user2.getEventId());
                    vip.register();

                }
        else
                {
                    System.out.println("seats available:");
                    int[][] ord = new int[4][3];
                    ord[0] = new int[]{1, 2, 3};
                    for (int i = 0; i < ord.length; i++) {
                        if (i != 0) {
                            System.out.print((char) (65 + i - 1));
                            System.out.print(" ");
                        }


                        for (int j = 0; j < ord[i].length; j++) {
                            if (i == 0 && j == 0) {
                                System.out.print(" ");
                            }
                            System.out.print(ord[i][j] + " ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < user1.getNumberOfSeats(); i++) {
                        boolean isValidSeat = false;
                        boolean isAlreadBooked = false;
                        while (!isValidSeat || !isAlreadBooked) {
                            try {
                                System.out.println("Enter the seats:");
                                String row = sc.nextLine();
                                char[] ch = row.toCharArray();
                                int finalRow = ch[0] - 65;
                                Integer seats = new Integer(String.valueOf(ch[1]));//to target the index value when 0 and ...
                                int finalSeats = seats - 1;//getting value in int then calculating
                                if (ord[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                                    isAlreadBooked = true;
                                    System.out.println("This seat is already Booked");
                                }
                                ord[finalRow + 1][finalSeats] = 1;
                                isValidSeat = true;
                                isAlreadBooked = true;//saying it is correct
                            } catch (Exception e) {
                                System.out.println("Invalid seat ,please enter valid seat");
                                isValidSeat = false;//saying it is wrong
                            }
                        }
                    }

                    OrdinaryEvent ordinary = new OrdinaryEvent();
                    ordinary.setEventId(12);
                    System.out.println("event id:");
                    user1.setEventId(ordinary.getEventId());
                    System.out.println(user1.getEventId());
                    ordinary.register();


                }}}