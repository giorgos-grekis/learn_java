package org.cisu;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String hmtl = sendHttpRequest(ip);
        System.out.println(hmtl);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }


}
