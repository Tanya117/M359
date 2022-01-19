package unit_7_lab;

public class TicketMaster {
String a = "1. A-Z";
String b = "2. Z-A";
String c = "3. low-high";
String d = "4. high-low";
String e = "5. city";
String f = "6. quit";

public String choices(){
    String out= "";
    out+= "\n" + a;
    out+= "\n" + b;
    out+= "\n" + c;
    out+= "\n" + d;
    out+= "\n" + e;
    out+= "\n" + f;
    return out;
}

}
