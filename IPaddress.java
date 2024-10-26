import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
   String[] logs = {
                              "10.0.0.1 bytes=32 time=50ms TTL=63",
                              "10.0.0.2 bytes=32 time=50ms TTL=73",
                              "10.0.0.2 bytes=32 time=50ms TTL=83",
                              "10.0.0.2 bytes=32 time=50ms TTL=93",
                            };
System.out.println(maxcountIP(logs));
  }

public static String maxcountIP(String[] logs)
{
  HashMap<String,Integer> hm = new HashMap<>();
  for(String log:logs)
  {
    String ip = extractIP(log);
    if(isValidIP(ip))
    {
      hm.put(ip,hm.getOrDefault(ip, 0)+1);
    }
  }
    String maxIP = null;
    int maxcount = 0;

    for(String ip :hm.keySet())
    {
        if(hm.get(ip)>maxcount)
        {
          maxcount = hm.get(ip);
          maxIP = ip;
        }
    }


  return maxIP ;
}

private static String extractIP(String log)
{
  String[] parts = log.split(" ");
  for(String part:parts)
  {
    if(isValidIP(part))
    {
      return part;
    }
  }

  return "";
}

private static boolean isValidIP(String ip) 
{
  String[] octets = ip.split("\\.");
  if(octets.length!=4)
  {
    return false;
  }

  for(String octet:octets)
  {
    if(!octet.matches("\\d+") || octet.length()>3 || Integer.parseInt(octet)>255 ||
    (octet.length()>1 && octet.startsWith("0")))
    {
        return false;
    }

  }

  return true;
}



}




