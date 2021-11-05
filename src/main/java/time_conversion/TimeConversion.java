package time_conversion;

public class TimeConversion {
    public void timeConversion(){
        String time = "09:05:45AM";
        String[] parts = time.split(":");
        String hour = parts[0];
        String min = parts[1];
        String sec = parts[2];


        //System.out.println(part3);
        if(sec.contains("PM")){
            int hx =  Integer.parseInt(hour) + 12 ;
            System.out.println(hx+":"+min+":"+sec.substring(0, 2));
        }

        if(sec.contains("AM")){
            if(hour.equals("12")){
                hour = "00";
            }
            System.out.println(hour+":"+min+":"+sec.substring(0, 2));
        }
    }
}
