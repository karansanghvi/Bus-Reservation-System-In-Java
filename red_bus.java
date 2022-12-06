import java.util.*;
import java.util.Date;

class red_bus 
{
    static Scanner l = new Scanner(System.in);
    static Scanner en = new Scanner(System.in);
    static Scanner i = new Scanner(System.in);
    static Scanner snew = new Scanner(System.in);
    static Calendar c = Calendar.getInstance();
    static Scanner cr = new Scanner(System.in);
    static int y = c.get(Calendar.YEAR);
    static int m = c.get(Calendar.MONTH);
    static int d = c.get(Calendar.DATE);
    static Date dat = new Date();
    static String s1 = dat.toString();
    static String date1 = s1.substring(0, 19) + " " + s1.substring(24, 28);
    static long ph;
    static int ch;
    static int otp;
    static String city;
    static String city1;
    static int ch1;
    static int mo;
    static int da;
    static String ac;
    static String con;
    static String fac[] = new String[4];
    static int seat;
    static String email;
    static String tra;
    static double rate;
    static String name;
    static String gen;
    static String des;
    static String rew1;
    static String rew2;
    static String rew3;
    static int age;
    static String fo;
    static long card;
    static String date;
    static int cvv;
    static String hold;
    static String bank;
    static String cus;
    static String cup;
    static String pick;
    static String day;

    public static void main(String args[]) throws Exception 
    {
        System.out.println(" _¦      ¦_     _¦¦¦¦¦¦¦¦  _¦        _¦¦¦¦¦¦¦¦  _¦¦¦¦¦¦_    ____¦¦¦____      _¦¦¦¦¦¦¦¦ ");
        System.out.println("¦¦¦      ¦¦¦   ¦¦¦    ¦¦¦ ¦¦¦       ¦¦¦    ¦¦¦ ¦¦¦    ¦¦¦ _¦¦¯¯¯¦¦¦¯¯¯¦¦_   ¦¦¦    ¦¦¦ ");
        System.out.println("¦¦¦      ¦¦¦   ¦¦¦    ¦¯  ¦¦¦       ¦¦¦    ¦¯  ¦¦¦    ¦¦¦ ¦¦¦   ¦¦¦   ¦¦¦   ¦¦¦    ¦¯  ");
        System.out.println("¦¦¦      ¦¦¦  _¦¦¦___     ¦¦¦       ¦¦¦        ¦¦¦    ¦¦¦ ¦¦¦   ¦¦¦   ¦¦¦  _¦¦¦___     ");
        System.out.println("¦¦¦      ¦¦¦ ¯¯¦¦¦¯¯¯     ¦¦¦       ¦¦¦        ¦¦¦    ¦¦¦ ¦¦¦   ¦¦¦   ¦¦¦ ¯¯¦¦¦¯¯¯     ");
        System.out.println("¦¦¦      ¦¦¦   ¦¦¦    ¦_  ¦¦¦       ¦¦¦    ¦_  ¦¦¦    ¦¦¦ ¦¦¦   ¦¦¦   ¦¦¦   ¦¦¦    ¦_  ");
        System.out.println("¦¦¦ _¦_ ¦¦¦    ¦¦¦    ¦¦¦ ¦¦¦¦    _ ¦¦¦    ¦¦¦ ¦¦¦    ¦¦¦ ¦¦¦   ¦¦¦   ¦¦¦   ¦¦¦    ¦¦¦ ");
        System.out.println(" ¯¦¦¦¯¦¦¦¯     ¦¦¦¦¦¦¦¦¦¦ ¦¦¦¦¦__¦¦ ¦¦¦¦¦¦¦¦¯   ¯¦¦¦¦¦¦¯   ¯¦   ¦¦¦   ¦¯    ¦¦¦¦¦¦¦¦¦¦ ");
        System.out.println("");
        System.out.println("");
        System.out.println("PRESS ENTER TO CONTINUE");
        en.nextLine();
        mov();
    }

    public static void mov() throws Exception {
        String sp = "";
        for (int i = 1; i <= 70; i++) {
            for (int j = 1; j <= 10000000; j++) {
            }
            System.out.println("\f");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(sp + "  ------------------------      ");
            System.out.println(sp + "/  |    |    |    |  |    \\    ");
            System.out.println(sp + "|   ____      ----    \\    \\   ");
            System.out.println(sp + "|  |   =|    |   =|     ````\\  ");
            System.out.println(sp + "|  |    |    |    |  RED BUS |  ");
            System.out.println(sp + "|   ----      ----           |  ");
            System.out.println(sp + " -/\\--------------------/\\-   ");
            System.out.println(sp + "  \\/                    \\/    ");
            sp += "  ";
        }
        load();
        opp();
    }

    public static void opp() {
        while (true) {
            System.out.println("\f");
            System.out.println("##########################");
            System.out.println("# What Do You Wish To Do #");
            System.out.println("##########################");
            System.out.println("");
            System.out.println("1. Already SignUp");
            System.out.println("2. SignUp");
            System.out.println("3. About Us");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            if (ch >= 1 && ch <= 4)
                break;
            else
                inv();
        }
        if (ch == 1)
            log();
        else if (ch == 2)
            sign();
        else if (ch == 3)
            about();
        else
            System.exit(0);
    }

    public static void log() {
        cus();
    }

    public static void sign() {
        while (true) {
            System.out.println("\fENTER YOUR PHONE NUMBER");
            ph = l.nextLong();
            int cnt = 0;
            long p = ph;
            while (p != 0) {
                int r = (int) (p % 10);
                cnt++;
                p /= 10;
            }
            if (cnt == 10) {
                break;
            } else {
                System.out.println("\fINVALID PHONE NUMBER ");
                System.out.println("PLEASE PRESS ENTER TO CONTINUE");
                en.nextLine();
            }
        }
        otp();
    }

    public static void cus() {
        while (true) {
            System.out.println("\fENTER YOUR CUSTOMER ID");
            int ot = i.nextInt();
            if (otp == ot)
                break;
            else {
                while (true) {
                    System.out.println("\fCUSTOMER ID WHICH YOU TYPE IS WRONG");
                    System.out.println("");
                    System.out.println("PLAESE ENTER YOUR CHOICE");
                    System.out.println("1. TO TRY AGAIN");
                    System.out.println("2. TO SEND A NEW CUSTOMER ID");
                    System.out.println("3. CHANGE PHONE NUMBER");
                    System.out.println("");
                    System.out.println("Enter Your Choice ...");
                    ch = i.nextInt();
                    if (ch >= 1 && ch <= 3)
                        break;
                    else {
                        inv();
                    }
                }
                if (ch == 1)
                    cus();
                else if (ch == 2)
                    otp();
                else if (ch == 3)
                    sign();
            }
        }
        op();
    }

    public static void otp() {
        System.out.println("\fTHIS IS YOUR CUSTOMER ID:");
        otp = (int) (Math.random() * 9000 + 1000);
        System.out.println(otp);
        System.out.println("");
        System.out.println("PRESS ENTER TO CONTINUE");
        en.nextLine();
        cus();
    }

    public static void about() {
        System.out.println("\f");
        System.out.println("############");
        System.out.println("# ABOUT US #");
        System.out.println("############");
        System.out.println("");
        System.out.println("RedBus is India’s largest online bus ticketing platform that has transformed bus ");
        System.out.println("travel in the country by bringing ease and convenience to millions of Indians who");
        System.out.println("travel using buses. Founded in 2006, redBus is part of India’s leading online travel");
        System.out.println("company MakeMyTrip Limited (NASDAQ: MMYT). By providing widest choice, superior ");
        System.out.println("customer service, lowest prices and unmatched benefits, redBus has served over 8 ");
        System.out.println("million customers. redBus has a global presence with operations across Indonesia, ");
        System.out.println("Singapore, Malaysia, Colombia and Peru apart from India.");
        System.out.println("");
        System.out.println("Press Enter To Continue");
        en.nextLine();
        opp();
    }

    public static void op() {
        while (true) {
            System.out.println("\f");
            System.out.println("######################");
            System.out.println("# What Do Wish To Do #");
            System.out.println("######################");
            System.out.println("");
            System.out.println("1. Book Bus Tickets ");
            System.out.println("2. Hire A Bus");
            System.out.println("3. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 3)
                break;
            else
                inv();
        }
        if (ch == 1)
            bus();
        else if (ch == 2)
            hire();
        else
            opp();
    }

    public static void bus() {
        while (true) {
            System.out.println("\fPlease Choose Your Origin");
            System.out.println("");
            System.out.println("1. Bangalore        7. Tirupati         13. Shirdi");
            System.out.println("2. Coimbatore       8. Chennai          14. Mangalore");
            System.out.println("3. Goa              9. Delhi            15. Jaipur");
            System.out.println("4. Indore          10. Hyderabad        16. Ahemdabad");
            System.out.println("5. Madurai         11. Kolkata          17. Jodpur");
            System.out.println("6. Pune            12. Mumbai           18. Nagpur");
            System.out.println("19. Back");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 19)
                break;
            else {
                inv();
            }
        }
        if (ch == 1)
            city = "1. Bangalore";
        else if (ch == 2)
            city = "2. Coimbatore";
        else if (ch == 3)
            city = "3. Goa";
        else if (ch == 4)
            city = "4. Indore";
        else if (ch == 5)
            city = "5. Madurai";
        else if (ch == 6)
            city = "6. Pune";
        else if (ch == 7)
            city = "7. Tirupati";
        else if (ch == 8)
            city = "8. Chennai";
        else if (ch == 9)
            city = "9. Delhi";
        else if (ch == 10)
            city = "10. Hyderabad";
        else if (ch == 11)
            city = "11. Kolkata";
        else if (ch == 12)
            city = "12. Mumbai";
        else if (ch == 13)
            city = "13. Shirdi";
        else if (ch == 14)
            city = "14. Mangalore";
        else if (ch == 15)
            city = "15. Jaipur";
        else if (ch == 16)
            city = "16. Ahemdabad";
        else if (ch == 17)
            city = "17. Jodpur";
        else if (ch == 18)
            city = "Nagpur";
        else
            op();
        while (true) {
            System.out.println("\fPlease Choose Your Destination");
            System.out.println();
            System.out.println("1. Bangalore        7. Tirupati         13. Shirdi");
            System.out.println("2. Coimbatore       8. Chennai          14. Mangalore");
            System.out.println("3. Goa              9. Delhi            15. Jaipur");
            System.out.println("4. Indore          10. Hyderabad        16. Ahemdabad");
            System.out.println("5. Madurai         11. Kolkata          17. Jodpur");
            System.out.println("6. Pune            12. Mumbai           18. Nagpur");
            System.out.println("19. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 19 && ch != ch1)
                break;
            else {
                inv();
            }
        }
        if (ch == 1)
            city1 = "1. Bangalore";
        else if (ch == 2)
            city1 = "2. Coimbatore";
        else if (ch == 3)
            city1 = "3. Goa";
        else if (ch == 4)
            city1 = "4. Indore";
        else if (ch == 5)
            city1 = "5. Madurai";
        else if (ch == 6)
            city1 = "6. Pune";
        else if (ch == 7)
            city1 = "7. Tirupati";
        else if (ch == 8)
            city1 = "8. Chennai";
        else if (ch == 9)
            city1 = "9. Delhi";
        else if (ch == 10)
            city1 = "10. Hyderabad";
        else if (ch == 11)
            city1 = "11. Kolkata";
        else if (ch == 12)
            city1 = "12. Mumbai";
        else if (ch == 13)
            city1 = "13. Shirdi";
        else if (ch == 14)
            city1 = "14. Mangalore";
        else if (ch == 15)
            city1 = "15. Jaipur";
        else if (ch == 16)
            city1 = "16. Ahemdabad";
        else if (ch == 17)
            city1 = "17. Jodpur";
        else if (ch == 18)
            city1 = "Nagpur";
        if (ch == 19)
            bus();
        d();
    }

    public static void d() {
        while (true) {
            System.out.println("\fWrite The Date Of Journey ");
            System.out.println("           DD/MM/YYYY");
            System.out.println("");
            date = snew.next();
            int da = Integer.parseInt(date.substring(0, 2));
            int mo = Integer.parseInt(date.substring(3, 5));
            int ye = Integer.parseInt(date.substring(6, 10));
            System.out.println(da + "," + mo + "," + ye);
            if (ye == y) {
                if (mo >= m && mo <= 12) {
                    if (mo == 1 || mo == 3 || mo == 5 || mo == 7 || mo == 8 || mo == 10 || mo == 12) {
                        if (da >= d && da <= 31)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else if (mo == 4 || mo == 6 || mo == 9 || mo == 11) {
                        if (da >= d && da <= 30)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else {
                        if (da >= d && da <= 28)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    }
                } else {
                    System.out.println("\fInvalid date");
                    System.out.println("Please Press Enter To Continue");
                    en.nextLine();
                }
            } else if (ye > y && ye <= (y + 1)) {
                if (mo >= 1 && mo <= 12) {
                    if (mo == 1 || mo == 3 || mo == 5 || mo == 7 || mo == 8 || mo == 10 || mo == 12) {
                        if (da >= 1 && da <= 31)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else if (mo == 4 || mo == 6 || mo == 9 || mo == 11) {
                        if (da >= 1 && da <= 30)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else {
                        if (da >= 1 && da <= 28)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    }
                } else {
                    System.out.println("\fInvalid date");
                    System.out.println("Please Press Enter To Continue");
                    en.nextLine();
                }
            } else {
                System.out.println("\fInvalid date");
                System.out.println("You Can Book Tickets For Year " + y + "-" + (y + 1));
                System.out.println("Please Press Enter To Continue");
                en.nextLine();
            }
        }
        while (true) {
            System.out.println("\fAre You Sure Do That These Information Are Correct");
            System.out.println("Yes/No");
            con = snew.next();
            if (con.equalsIgnoreCase("yes") || con.equalsIgnoreCase("no"))
                break;
            else
                inv();
        }
        if (con.equalsIgnoreCase("yes")) {
            ac();
        } else {
            while (true) {
                System.out.println("What Changes Do You Want To Do");
                System.out.println("");
                System.out.println("1. Change Date");
                System.out.println("2. Change Origin And Destination");
                ch = i.nextInt();
                if (ch >= 1 && ch <= 2)
                    break;
                else
                    inv();
            }
            if (ch == 1)
                d();
            if (ch == 2)
                bus();
        }
    }

    public static void ac() {
        while (true) {
            System.out.println("\fIn Which Bus Do You Wish To Travel ?");
            System.out.println("");
            System.out.println("1. A/C Bus");
            System.out.println("2. Non A/C Bus");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 2)
                break;
            else
                inv();
        }
        if (ch == 1)
            ac = "A/C BUS";
        else
            ac = "Non A/C BUS";
        fa();
    }

    public static void fa() {
        int cnt = 0;
        while (true) {
            System.out.println("\fWhat Facilites You Want In Your Seat");
            System.out.println("");
            System.out.println("1. Blankets");
            System.out.println("2. Charging point");
            System.out.println("3. Facial Tissues");
            System.out.println("4. Emergency Exit");
            System.out.println("5. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 5)
                break;
            else
                inv();
        }
        if (ch == 1)
            fac[cnt] = "Blanket";
        else if (ch == 2)
            fac[cnt] = "Charging point";
        else if (ch == 3)
            fac[cnt] = "Facial Tissues";
        else if (ch == 4)
            fac[cnt] = "Emergency Exit";
        else
            ac();
        while (true) {
            System.out.println("\fDo You Want To Add Some Facilities More");
            System.out.println("Yes/No");
            con = snew.next();
            if (con.equalsIgnoreCase("yes") || con.equalsIgnoreCase("no"))
                break;
            else
                inv();
        }
        if (con.equalsIgnoreCase("yes")) {
            cnt++;
            fa();
        } else if (con.equalsIgnoreCase("no")) {
            bu();
        }
    }

    public static void bu() {
        while (true) {
            System.out.println("\fCHOOSE BUS TRAVELS");
            System.out.println("");
            System.out.println("1. Orange Tours And Travels           6. Sharma Travels");
            System.out.println("2. VRL Travels                        7. Geepee Travels");
            System.out.println("3. SRS Travels                        8. Seabird Travels");
            System.out.println("4. Anand Travels                      9. Chauhan travels");
            System.out.println("5. National Travels                  10. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 10)
                break;
            else
                inv();
        }
        if (ch == 1) {
            tra = "Orange Tours And Travels";
            rate = 4.2;
            des = "Multi Axle Sleeper With All \n Facilities And Upto 10% Off";
            rew1 = "Jhenil : Excellent \n Nice ambience, great interiors and \n well hospitality ";
            rew2 = "Suresh : Nice \n very comfortable and clean. \n They are very advance in their technology \n and service";
            rew3 = "Vijay : I liked it \n It was pleasant journey, it arrived \n  earlier then expected time ";
        } else if (ch == 2) {
            tra = "VRL Travels";
            rate = 4.6;
            des = "Double Decer Bus With CCTV \n And Heater Facilites (For Winter)\n And Upto 7% off";
            rew1 = "Riyank  : I like \n Punctuality, staff behaviour and cleanliness \n the best part is the silent travel";
            rew2 = "Someone : Excellent \n The bus condition was better than all \n other and thanks for headphones";
            rew3 = "Krish : Best \n New bus,clean bed sheet and blankets \n including curtains. Timely service \n and full comfort ";
        } else if (ch == 3) {
            tra = "SRS Travels";
            rate = 3.8;
            des = "Multi Axle Sleeper(2+2) With All \n Facilities And Upto 10%\n Off";
            rew1 = "User : Good \n Everything was good but rest \n stop was not hygine";
            rew2 = "Matt : Good \n The bus was good but TV was not \n working properly \n so I felt exhausted ";
            rew3 = "Vinit : Best \n Cleanliness was good but staff behaviour \n was ok";
        } else if (ch == 4) {
            tra = "Anand Travels";
            rate = 3.6;
            des = "A/C & Non A/C Sleeper (2+1) \n With Fast Travels";
            rew1 = "Samyak : Wow \n nice bus and fast too";
            rew2 = "Ansh : Nice \n The bus was nice but \n there were no book \n facility";
            rew3 = "Jenil Parmar : Ok \n Everything was nice but \n seat were small ";
        } else if (ch == 5) {
            tra = "National Travels";
            rate = 3.0;
            des = "..";
            rew1 = "Adnan : Better \n Better bus travel then previous \n time";
            rew2 = "Harsh : Good \n  Facilites were good but bus was \n slow";
            rew3 = "Chintu : Bad \n Very chindi bus it was ";
        } else if (ch == 6) {
            tra = "Sharma Travels";
            rate = 3.2;
            des = "Sharma Travels Give You 12% Off";
            rew1 = "Chirag : Great \n Great experience in this bus";
            rew2 = "Big Boy : Faltu \n This bus travels is not good at \n all ";
            rew3 = "Ritesh : Good \n Every thing was good but no music system in the bus";
        } else if (ch == 7) {
            tra = "Geepee Travels";
            rate = 2.9;
            des = "All facilites will be \n provided in this bus with \n headset";
            rew1 = "Red Bus User : .. \n No words to say ";
            rew2 = "Roman : Kk \n Every thing was nice but headset were defective ";
            rew3 = "Jeff : Great \n This bus made my journy \n best  ";
        } else if (ch == 8) {
            tra = "Seabird Travels";
            rate = 2.5;
            des = "TV In This Bus Is Included \n With All Facilities And \n Upto 11% Off";
            rew1 = "User : ..";
            rew2 = "Shivnayak : Ok \n This bus travels is not good but \n but not bad also ";
            rew3 = "Aman  : Small \n Very small and worst bus ";
        } else if (ch == 9) {
            tra = "Chauhan Travels";
            rate = 2.2;
            des = "..";
            rew1 = "Rahul : Ok \n This bus travels is not good but \n but not bad also ";
            rew2 = "Amit : Worst.. \n Not good at all";
            rew3 = "Amam Dalal : **c* of* \n Bad bus driver ";
        } else
            fa();
        re();
    }

    public static void re() {
        System.out.println("\f");
        System.out.println(tra);
        System.out.println("");
        System.out.println("Ratings : " + rate);
        System.out.println("");
        System.out.println("Description");
        System.out.println(des);
        System.out.println("");
        System.out.println("Rewiews");
        System.out.println(rew1);
        System.out.println("");
        System.out.println(rew2);
        System.out.println("");
        System.out.println(rew3);
        System.out.println("Press Any Key To Continue Or B To Go Back");
        String ch = snew.next();
        if (ch.equalsIgnoreCase("B"))
            bu();
        else
            co();
    }

    public static void co() {
        while (true) {
            System.out.println("\f");
            System.out.println("Select The Bus In Which You Wish To Travel ");
            System.out.println("");
            System.out.println("1. Mercedes Benz");
            System.out.println("2. Audi");
            System.out.println("3. Volvo");
            System.out.println("4. Mahindra");
            System.out.println("5. Tata");
            System.out.println("6. Hyundai");
            System.out.println("7. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 || ch <= 7)
                break;
            else
                inv();
        }
        if (ch == 7)
            re();
        seat();
    }

    public static void seat() {
        while (true) {
            System.out.println("\fSelect Your Seat Number");
            System.out.println("");
            System.out.println("                                   ( )");
            System.out.println("                                                ");
            System.out.println("                              ___     ___       ");
            System.out.println("                             |   |   |   |      ");
            System.out.println("                            || 1 || || 2 ||     ");
            System.out.println("                              ===     ===       ");
            System.out.println("   ___     ___                ___     ___       ");
            System.out.println("  |   |   |   |              |   |   |   |      ");
            System.out.println(" || 3 || || 4 ||            || 5 || || 6 ||     ");
            System.out.println("   ===     ===                ===     ===       ");
            System.out.println("   ___     ___                ___     ___       ");
            System.out.println("  |   |   |   |              |   |   |   |      ");
            System.out.println(" || 7 || || 8 ||            || 9 || || 10||     ");
            System.out.println("   ===     ===                ===     ===       ");
            System.out.println("   ___     ___                ___     ___       ");
            System.out.println("  |   |   |   |              |   |   |   |      ");
            System.out.println(" || 11|| || 12||            || 13|| || 14||     ");
            System.out.println("   ===     ===                ===     ===       ");
            System.out.println("   ___     ___                ___     ___       ");
            System.out.println("  |   |   |   |              |   |   |   |      ");
            System.out.println(" || 15|| || 16||            || 17|| || 18||     ");
            System.out.println("   ===     ===                ===     ===       ");
            System.out.println("   ___     ___                ___     ___       ");
            System.out.println("  |   |   |   |              |   |   |   |      ");
            System.out.println(" || 19|| || 20||            || 21|| || 22||     ");
            System.out.println("   ===     ===                ===     ===       ");
            System.out.println("   ___     ___                ___     ___       ");
            System.out.println("  |   |   |   |              |   |   |   |      ");
            System.out.println(" || 23|| || 24||            || 25|| || 26||     ");
            System.out.println("   ===     ===                ===     ===       ");
            System.out.println("     ___     ___     ___     ___     ___        ");
            System.out.println("    |   |   |   |   |   |   |   |   |   |       ");
            System.out.println("   || 27|| || 28|| || 29|| || 30|| || 31||      ");
            System.out.println("     ===     ===     ===     ===     ===        ");
            System.out.println("");
            System.out.println("Enter 0 to Go Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 0 && ch <= 31)
                break;
            else

                inv();
        }
        System.out.println("\fYour Seat Number Is " + ch);
        System.out.println("Press Enter To Continue");
        en.nextLine();
        seat = ch;
        det();
    }

    public static void det() {
        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("\fEnter Your Email Id ");
            email = sc1.nextLine();
            if (email.endsWith(".com"))
                break;
            else {
                System.out.println("\fInvalid Email ");
                System.out.println("Please Press Enter To Continue ");
                en.nextLine();
            }
        }
        System.out.println("\fEnter Your Name ");
        name = snew.nextLine();
        while (true) {
            System.out.println("\fEnter Your Gender ");
            System.out.println("Male/Female");
            gen = snew.nextLine();
            if (gen.equalsIgnoreCase("male") || gen.equalsIgnoreCase("female"))
                break;
            else {
                System.out.println("\fInvalid Gender ");
                System.out.println("Please Press Enter To Continue ");
                en.nextLine();
            }
        }
        while (true) {
            System.out.println("\fEnter Your Age ");
            age = snew.nextInt();
            if (age >= 1 && age <= 120)
                break;
            else {
                System.out.println("\fInvalid Age ");
                System.out.println("Please Press Enter To Continue ");
                en.nextLine();
            }
        }
        while (true) {
            System.out.println("\fAre You Sure That All This Information Are Correct");
            System.out.println("Yes/No");
            System.out.println("");
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Gender : " + gen);
            System.out.println("Email Id : " + email);
            System.out.println("");
            con = snew.next();
            if (con.equalsIgnoreCase("yes") || con.equalsIgnoreCase("no"))
                break;
            else
                inv();
        }
        if (con.equalsIgnoreCase("yes"))
            foop();
        else
            det();
    }

    public static void foop() {
        while (true) {
            System.out.println("\fDo Wish To Have Food During Journey ");
            System.out.println("Yes/no");
            fo = snew.next();
            if (fo.equalsIgnoreCase("yes") || fo.equalsIgnoreCase("no"))
                break;
            else
                inv();
        }
        if (fo.equalsIgnoreCase("yes"))
            food();
        else
            bill();
    }

    public static void food() {
        while (true) {
            System.out.println("\fSelect The Thali Which You Wish To Eat");
            System.out.println("");
            System.out.println("1. SOUTH INDIAN THALI");
            System.out.println("  Contains : Rice, Samhar, Kootu, Kosumri, Papad, Curd and Akkaravadisal.");
            System.out.println("");
            System.out.println("2. KATHIAWADI THALI ");
            System.out.println(
                    "  Contains : Raasawala, Dhokla, Bajra, Bhakri, Methi Thepla, Gujarati Dal and Gol Papdi.");
            System.out.println("");
            System.out.println("3. MAHARASHTRIAN THALI");
            System.out.println("  Contains : Sabudanna Vada, Mattha, Kanda Poha, Danyachi Usal, and Pav Bhaji.");
            System.out.println("");
            System.out.println("4. HARYANVI THALI");
            System.out.println(
                    "  Contains : Kachri, Hara Dhania CHolia, Mithey Chawal, Alsi ki Pinni, Maipuas and Kachi Lassi");
            System.out.println("");
            System.out.println("5. RAJASTHANI THALI");
            System.out.println(
                    "  Contains : Gatte ki Sabji, Dall-Baati Churma, Khichda, Bajre ki Rotti, Mawa Kachori and Malpuas");
            System.out.println("");
            System.out.println("6. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 6)
                break;
            else
                inv();
        }
        if (ch == 6)
            foop();
        bill();
    }

    public static void bill() {
        int fo_pr = 0;

        fo_pr = 500;
        double gst = ((2700 + fo_pr) * 0.20);
        double amt = (2700 + fo_pr);
        System.out.println("\f             THIS IS BILL               ");
        System.out.println("                                          ");
        System.out.println(" ---------------------------------------- ");
        System.out.println(" ######################################## ");
        System.out.println(" #################RED BUS################ ");
        System.out.println(" ######################################## ");
        System.out.println(" ---------------------------------------- ");
        System.out.println("                                          ");
        System.out.println(" NAME   : " + name + "                        ");
        System.out.println(" GENDER : " + gen + "                         ");
        System.out.println(" AGE    : " + age + "                         ");
        System.out.println("                                          ");
        System.out.println("------------------------------------------");
        System.out.println(" ######################################## ");
        System.out.println(" #                PRICES                # ");
        System.out.println(" ######################################## ");
        System.out.println("                                          ");
        System.out.println(" Bus Tickets  : 2000.0                    ");
        System.out.println(" Facilities   : 700.0                     ");
        System.out.println(" Food         : " + fo_pr + "                 ");
        System.out.println(" Amount       : " + amt + "                   ");
        System.out.println(" GST          : " + gst + "                   ");
        System.out.println(" Total Amount : " + (amt + gst) + "             ");
        System.out.println("                                          ");
        System.out.println(" ||| ||| ||||||| |||||| |||||||| ||| |||| ");
        System.out.println(" 290 26597873398  5375 77 8036 8224 45 10 ");
        System.out.println("                                          ");
        System.out.println("Press Enter To Pay Bill");
        en.nextLine();
        pay();
    }

    public static void pay() {
        while (true) {
            System.out.println("\fHow Will Wish To Pay The Bill");
            System.out.println("");
            System.out.println("1. Debit Card");
            System.out.println("2. Credit Card");
            System.out.println("3. Net Banking");
            System.out.println("4. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 3)
                break;
            else
                inv();
        }
        if (ch == 1 || ch == 2)
            card();
        else if (ch == 3)
            net();
        else
            bill();
    }

    public static void card() {
        while (true) {
            System.out.println("\fPlease Enter Your Card Number");
            System.out.println("");
            card = l.nextLong();
            int cnt = 0;
            long c = card;
            while (c != 0) {
                int r = (int) (c % 10);
                cnt++;
                c /= 10;
            }
            if (cnt == 16) {
                break;
            } else {
                System.out.println("\fINVALID CARD NUMBER ");
                System.out.println("CARD NUMBER IS OF 16 DIGIT");
                System.out.println("PLEASE PRESS ENTER TO CONTINUE");
                en.nextLine();
            }
        }
        while (true) {
            System.out.println("\fEnter CVV");
            cvv = i.nextInt();
            int cnt = 0;
            int c = cvv;
            while (c != 0) {
                int r = c % 10;
                cnt++;
                c /= 10;
            }
            if (cnt == 3) {
                break;
            } else {
                System.out.println("\fINVALID CARD NUMBER ");
                System.out.println("CARD NUMBER IS OF 3 DIGIT");
                System.out.println("PLEASE PRESS ENTER TO CONTINUE");
                en.nextLine();
            }
        }
        Scanner s1 = new Scanner(System.in);
        System.out.println("\fPlease Enter The Card Holder's Name");
        hold = s1.nextLine();
        while (true) {
            System.out.println("\fAre You Sure That All These Information Are Correct");
            System.out.println("Yes/no");
            System.out.println("");
            System.out.println(" ----------------------------");
            System.out.println("|     CARD NUMBER            |");
            System.out.println("|   __________________       |");
            System.out.println("|  | " + card + "     |      |");
            System.out.println("|   ------------------       |");
            System.out.println("|  EXPIRY DATE    CVV        |");
            System.out.println("|   ---------    ----------  |");
            System.out.println("|  | 01/" + (y + 1) + " |  | " + cvv + " | ");
            System.out.println("|   ---------    ----------  |");
            System.out.println("|  CARD HOLDER'S NAME        |");
            System.out.println("|   -------------------      |");
            System.out.println("|  | " + hold + "    |      |");
            System.out.println("|   -------------------      |");
            System.out.println(" ----------------------------");
            con = snew.next();
            if (con.equalsIgnoreCase("yes") || con.equalsIgnoreCase("no"))
                break;
            else
                inv();
        }
        if (con.equalsIgnoreCase("yes"))
            tick();
        else
            card();
    }

    public static void net() {
        while (true) {
            System.out.println("\fWhat Is Your Bank Name");
            System.out.println("");
            System.out.println("1. AXIS BANK");
            System.out.println("2. HDFC BANK");
            System.out.println("3. ICICI BANK");
            System.out.println("4. STATE BANK OF INDIA");
            System.out.println("5. BACK");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 5)
                break;
            else
                inv();
        }
        if (ch == 5)
            pay();
        System.out.println("\fPlease Enter Your Customer Id Of Your Bank");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        cus = sc.nextLine();
        System.out.println("\fPlease Enter Password");
        cup = snew.nextLine();
        tick();
    }

    public static void load() throws Exception {
        for (int j = 1; j <= 3; j++) {
            System.out.print("LOADING");
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(500);
                if (i == 5) {
                    System.out.print("\f");
                } else {
                    System.out.print(".");
                }
            }
        }
    }

    public static void tick() {
        String f = "";
        for (int i = 0; i < fac.length; i++)
            f += fac[i] + ", ";
        System.out.println("\fThis Is Your Bus Ticket");
        System.out.println("");
        System.out.println("");
        System.out.println("                                                         " + date1);
        System.out.println("                                                                               ");
        System.out.println("###########                                        Travel related quaries      ");
        System.out.println("# RED BUS #                                       (020)66841800/668411818      ");
        System.out.println("###########                                                                    ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" Date : " + date + "                                         Time : 09:30 am       ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out
                .println(" Route : " + city + " To " + city1 + " Pick Up Point : " + city + " Main Bus Stop          ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Seat : " + seat + " Facilites : " + f + "                                              ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Name : " + name + "                Phone :" + ph);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Press Enter To Continue");
        en.nextLine();
        while (true) {
            System.out.println("\f1. Go To Main Menu");
            System.out.println("2. Back");
            System.out.println("3. Exit");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 3)
                break;
            else
                inv();
        }
        if (ch == 1)
            opp();
        else if (ch == 2)
            tick();
        else
            System.exit(0);
    }

    public static void hire() {
        while (true) {
            System.out.println("\f");
            System.out.println("Tell Us Where Are You Travelling");
            System.out.println("");
            System.out.println("      _   _|_   ");
            System.out.println("     /.| |:::| ");
            System.out.println("     |.| |:::| ");
            System.out.println("     `````````");
            System.out.println("      1. LOCAL");
            System.out.println(" ");
            System.out.println("       /\\ *  ");
            System.out.println("      /  /\\  ");
            System.out.println("      ``/  \\ ");
            System.out.println("        ````  ");
            System.out.println("     2. OUT STATION");
            System.out.println("");
            System.out.println("     3. BACK");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 3)
                break;
            else
                inv();
        }
        if (ch == 3)
            op();
        ci();
    }

    public static void ci() {
        while (true) {
            System.out.println("\fPlease Select City Of Hire");
            System.out.println("");
            System.out.println("1. Bangalore        7. Tirupati         13. Shirdi");
            System.out.println("2. Coimbatore       8. Chennai          14. Mangalore");
            System.out.println("3. Goa              9. Delhi            15. Jaipur");
            System.out.println("4. Indore          10. Hyderabad        16. Ahemdabad");
            System.out.println("5. Madurai         11. Kolkata          17. Jodpur");
            System.out.println("6. Pune            12. Mumbai           18. Nagpur");
            System.out.println("19. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 19)
                break;
            else {
                inv();
            }
        }
        if (ch == 19)
            hire();
        else if (ch == 1)
            city = "1. Bangalore";
        else if (ch == 2)
            city = "2. Coimbatore";
        else if (ch == 3)
            city = "3. Goa";
        else if (ch == 4)
            city = "4. Indore";
        else if (ch == 5)
            city = "5. Madurai";
        else if (ch == 6)
            city = "6. Pune";
        else if (ch == 7)
            city = "7. Tirupati";
        else if (ch == 8)
            city = "8. Chennai";
        else if (ch == 9)
            city = "9. Delhi";
        else if (ch == 10)
            city = "10. Hyderabad";
        else if (ch == 11)
            city = "11. Kolkata";
        else if (ch == 12)
            city = "12. Mumbai";
        else if (ch == 13)
            city = "13. Shirdi";
        else if (ch == 14)
            city = "14. Mangalore";
        else if (ch == 15)
            city = "15. Jaipur";
        else if (ch == 16)
            city = "16. Ahemdabad";
        else if (ch == 17)
            city = "17. Jodpur";
        else if (ch == 18)
            city = "Nagpur";
        System.out.println("\fPlease Enter Your Pick Up Point");
        pick = snew.nextLine();
        while (true) {
            System.out.println("\fPlease Choose Your Destination");
            System.out.println();
            System.out.println("1. Bangalore        7. Tirupati         13. Shirdi");
            System.out.println("2. Coimbatore       8. Chennai          14. Mangalore");
            System.out.println("3. Goa              9. Delhi            15. Jaipur");
            System.out.println("4. Indore          10. Hyderabad        16. Ahemdabad");
            System.out.println("5. Madurai         11. Kolkata          17. Jodpur");
            System.out.println("6. Pune            12. Mumbai           18. Nagpur");
            System.out.println("19. Back");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 19 && ch != ch1)
                break;
            else {
                inv();
            }
        }
        if (ch == 1)
            city1 = "1. Bangalore";
        else if (ch == 2)
            city1 = "2. Coimbatore";
        else if (ch == 3)
            city1 = "3. Goa";
        else if (ch == 4)
            city1 = "4. Indore";
        else if (ch == 5)
            city1 = "5. Madurai";
        else if (ch == 6)
            city1 = "6. Pune";
        else if (ch == 7)
            city1 = "7. Tirupati";
        else if (ch == 8)
            city1 = "8. Chennai";
        else if (ch == 9)
            city1 = "9. Delhi";
        else if (ch == 10)
            city1 = "10. Hyderabad";
        else if (ch == 11)
            city1 = "11. Kolkata";
        else if (ch == 12)
            city1 = "12. Mumbai";
        else if (ch == 13)
            city1 = "13. Shirdi";
        else if (ch == 14)
            city1 = "14. Mangalore";
        else if (ch == 15)
            city1 = "15. Jaipur";
        else if (ch == 16)
            city1 = "16. Ahemdabad";
        else if (ch == 17)
            city1 = "17. Jodpur";
        else if (ch == 18)
            city1 = "Nagpur";
        else if (ch == 19)
            ci();
        da();
    }

    public static void da() {
        while (true) {
            System.out.println("\fWhen Do You Need The Bus ");
            System.out.println("           DD/MM/YYYY");
            System.out.println("");
            date = snew.next();
            int da = Integer.parseInt(date.substring(0, 2));
            int mo = Integer.parseInt(date.substring(3, 5));
            int ye = Integer.parseInt(date.substring(6, 10));
            System.out.println(da + "," + mo + "," + ye);
            if (ye == y) {
                if (mo >= m && mo <= 12) {
                    if (mo == 1 || mo == 3 || mo == 5 || mo == 7 || mo == 8 || mo == 10 || mo == 12) {
                        if (da >= d && da <= 31)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else if (mo == 4 || mo == 6 || mo == 9 || mo == 11) {
                        if (da >= d && da <= 30)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else {
                        if (da >= d && da <= 28)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    }
                } else {
                    System.out.println("\fInvalid date");
                    System.out.println("Please Press Enter To Continue");
                    en.nextLine();
                }
            } else if (ye > y && ye <= (y + 1)) {
                if (mo >= 1 && mo <= 12) {
                    if (mo == 1 || mo == 3 || mo == 5 || mo == 7 || mo == 8 || mo == 10 || mo == 12) {
                        if (da >= 1 && da <= 31)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else if (mo == 4 || mo == 6 || mo == 9 || mo == 11) {
                        if (da >= 1 && da <= 30)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    } else {
                        if (da >= 1 && da <= 28)
                            break;
                        else {
                            System.out.println("\fInvalid date");
                            System.out.println("Please Press Enter To Continue");
                            en.nextLine();
                        }
                    }
                } else {
                    System.out.println("\fInvalid date");
                    System.out.println("Please Press Enter To Continue");
                    en.nextLine();
                }
            } else {
                System.out.println("\fInvalid date");
                System.out.println("You Can Hire A Bus In " + y + "-" + (y + 1));
                System.out.println("Please Press Enter To Continue");
                en.nextLine();
            }
        }
        while (true) {
            System.out.println("\fFor How Many Days You Need Our Bus ?");
            System.out.println("");
            da = snew.nextInt();
            if (da >= 1 && da <= 20)
                break;
            else {
                System.out.println("\fInvalid Days ");
                System.out.println("You Can Not Take Our For More Than 20 Days");
                System.out.println("Please Enter To Continue");
            }
        }
        in();
    }

    public static void in() {
        while (true) {
            System.out.println("\fWhich Bus Do You Need");
            System.out.println("");
            System.out.println("1. A/C Bus");
            System.out.println("2. Non A/c Bus");
            System.out.println("3. Back");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 3)
                break;
            else
                inv();
        }
        if (ch == 3)
            da();
        while (true) {
            System.out.println("\fWhich Bus Do You Need");
            System.out.println("");
            System.out.println("1. 10 Seaters");
            System.out.println("2. 20 Seaters");
            System.out.println("3. 35 Seaters");
            System.out.println("4. 40 Seaters");
            System.out.println("5. Back");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 5)
                break;
            else
                inv();
        }
        if (ch == 5)
            in();
        det1();
    }

    public static void det1() {
        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("\fEnter Your Email Id ");
            email = sc1.nextLine();
            if (email.endsWith(".com"))
                break;
            else {
                System.out.println("\fInvalid Email ");
                System.out.println("Please Press Enter To Continue ");
                en.nextLine();
            }
        }
        System.out.println("\fEnter Your Name ");
        name = snew.nextLine();
        while (true) {
            System.out.println("\fAre You Sure That All This Information Are Correct");
            System.out.println("Yes/No");
            System.out.println("");
            System.out.println("Name : " + name);
            System.out.println("Email Id : " + email);
            System.out.println("");
            con = snew.next();
            if (con.equalsIgnoreCase("yes") || con.equalsIgnoreCase("no"))
                break;
            else
                inv();
        }
        if (con.equalsIgnoreCase("yes"))
            bil();
        else
            det1();
    }

    public static void bil() {
        int s = 12000 * da;
        System.out.println("\fYou Have To Pay " + s);
        System.out.println("");
        System.out.println("Press Enter To For Payment");
        en.nextLine();
        pay1();
    }

    public static void pay1() {
        while (true) {
            System.out.println("\fHow Will Wish To Pay The Bill");
            System.out.println("");
            System.out.println("1. Debit Card");
            System.out.println("2. Credit Card");
            System.out.println("3. Net Banking");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 3)
                break;
            else
                inv();
        }
        if (ch == 1)
            card1();
        else
            net1();
    }

    public static void card1() {
        while (true) {
            System.out.println("\fPlease Enter Your Card Number");
            System.out.println("");
            card = l.nextLong();
            int cnt = 0;
            long c = card;
            while (c != 0) {
                int r = (int) (c % 10);
                cnt++;
                c /= 10;
            }
            if (cnt == 16) {
                break;
            } else {
                System.out.println("\fINVALID CARD NUMBER ");
                System.out.println("CARD NUMBER IS OF 16 DIGIT");
                System.out.println("PLEASE PRESS ENTER TO CONTINUE");
                en.nextLine();
            }
        }
        while (true) {
            System.out.println("\fEnter CVV");
            cvv = i.nextInt();
            int cnt = 0;
            int c = cvv;
            while (c != 0) {
                int r = c % 10;
                cnt++;
                c /= 10;
            }
            if (cnt == 3) {
                break;
            } else {
                System.out.println("\fINVALID CARD NUMBER ");
                System.out.println("CARD NUMBER IS OF 3 DIGIT");
                System.out.println("PLEASE PRESS ENTER TO CONTINUE");
                en.nextLine();
            }
        }
        System.out.println("\fPlease Enter The Card Holder's Name");
        hold = snew.nextLine();
        while (true) {
            System.out.println("\fAre You Sure That All These Information Are Correct");
            System.out.println("Yes/no");
            System.out.println("");
            System.out.println(" ------------------------");
            System.out.println("|     CARD NUMBER        |");
            System.out.println("|   ______________       |");
            System.out.println("|  | " + card + " |   |");
            System.out.println("|   --------------       |");
            System.out.println("|  EXPIRY DATE    CVV    |");
            System.out.println("|   ---------    ------  |");
            System.out.println("|  | 01/" + (y + 1) + " |  | " + cvv + " | |");
            System.out.println("|   ---------    ------  |");
            System.out.println("|  CARD HOLDER'S NAME    |");
            System.out.println("|   ---------------      |");
            System.out.println("|  | " + hold + "    |      |");
            System.out.println("|   ---------------      |");
            System.out.println(" ------------------------");
            con = snew.next();
            if (con.equalsIgnoreCase("yes") || con.equalsIgnoreCase("no"))
                break;
            else
                inv();
        }
        if (con.equalsIgnoreCase("yes")) {
            m_bill();
        } else
            card();
    }

    public static void net1() {
        while (true) {
            System.out.println("\fWhat Is Your Bank Name");
            System.out.println("");
            System.out.println("1. AXIS BANK");
            System.out.println("2. HDFC BANK");
            System.out.println("3. ICICI BANK");
            System.out.println("4. STATE BANK OF INDIA");
            System.out.println("");
            System.out.println("Enter Your Choice ...");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 4)
                break;
            else
                inv();
        }

        System.out.println("\fPlease Enter Your Customer Id Of Your Bank");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        cus = sc.nextLine();
        System.out.println("\fPlease Enter Password");
        cup = snew.nextLine();
        m_bill();
    }

    public static void m_bill() {
        double gst = (12000 * da) * 0.20;
        double t = (12000 * da) + gst;
        System.out.println("\fThis is your bill");
        System.out.println("");
        System.out.println("               " + date1);
        System.out.println("###########  #################");
        System.out.println("# RED BUS #  # BUS HIRE BILL #");
        System.out.println("###########  #################");
        System.out.println("                              ");
        System.out.println(" Name         : " + name);
        System.out.println("Phone Number  : " + ph);
        System.out.println("Email Address : " + email);
        System.out.println("Date          : " + date);
        System.out.println("Days Need     : " + da);
        System.out.println("                              ");
        System.out.println("//////////////////////////////");
        System.out.println("                              ");
        System.out.println("Amount       : " + 12000 * da + ".0");
        System.out.println("GST          : " + gst);
        System.out.println("Total Amount : " + t);
        System.out.println("                              ");
        System.out.println("|| |||||| | |||||| || |||| |||");
        System.out.println("02 2334557692 2276338 37383 67");
        en.nextLine();
        while (true) {
            System.out.println("\f1. Go To Main Menu");
            System.out.println("2. Back");
            System.out.println("3. Exit");
            ch = i.nextInt();
            if (ch >= 1 && ch <= 3)
                break;
            else
                inv();
        }
        if (ch == 1)
            opp();
        else if (ch == 2)
            tick();
        else
            System.exit(0);
    }

    public static void inv() {
        System.out.println("\f");
        System.out.println("  ===================================  ");
        System.out.println("|| CHOICE WHICH YOU ENTER IS INVALID ||");
        System.out.println("  ===================================  ");
        System.out.println("|| PLEASE PRESS ENTER TO TRY AGAIN   ||");
        System.out.println("  ===================================  ");
        en.nextLine();
    }
}