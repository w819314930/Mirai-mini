package com.company.Helpers;

import com.company.Models.Credential;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IPScannerHelper {

    public boolean isPortOpen(String ip, int port, int timeOut)
    {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), timeOut);
            socket.close();

            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean isIpUp(String host, int timeOut)
    {

        // todo implement rocksaw

        InetAddress ip = null;
        boolean isReachable = false;

        try {
            ip = InetAddress.getByName(host);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        byte[] bytes = ip.getAddress();

        try {
            isReachable = InetAddress.getByAddress(bytes).isReachable(timeOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return isReachable;
    }

    public List<Credential> retrieveTelnetCredentialsMap()
    {
        List<Credential> credentialList = new ArrayList<>();

        credentialList.add(new Credential("root", "pass", 0));
        credentialList.add(new Credential("root", "calvin", 2));
        credentialList.add(new Credential("administrator", "password", 0));
        credentialList.add(new Credential("NetLinx", "password", 1));
        credentialList.add(new Credential("administrator", "Amx1234!", 2));
        credentialList.add(new Credential("amx", "password", 1));
        credentialList.add(new Credential("amx", "Amx1234!", 1));
        credentialList.add(new Credential("admin", "1988", 2));
        credentialList.add(new Credential("admin", "admin", 0));
        credentialList.add(new Credential("Administrator", "Vision2", 1));
        credentialList.add(new Credential("cisco", "cisco", 0));
        credentialList.add(new Credential("root", "fidel123", 2));
        credentialList.add(new Credential("user", "user", 0));
        credentialList.add(new Credential("root", "default", 0));
        credentialList.add(new Credential("localadmin", "localadmin", 1));
        credentialList.add(new Credential("Root", "wago", 2));
        credentialList.add(new Credential("Admin", "wago", 2));
        credentialList.add(new Credential("User", "user", 1));
        credentialList.add(new Credential("Guest", "guest", 0));
        credentialList.add(new Credential("root", "rootpasswd", 1));
        credentialList.add(new Credential("admin", "password", 0));
        credentialList.add(new Credential("adtec", "none", 1));
        credentialList.add(new Credential("root", "timeserver", 1));
        credentialList.add(new Credential("root", "password", 0));
        credentialList.add(new Credential("Admin", "Su", 1));
        credentialList.add(new Credential("root", "admin", 0));
        credentialList.add(new Credential("admin", "motorola", 1));
        credentialList.add(new Credential("Admin", "5001", 1));
        credentialList.add(new Credential("User", "1001", 1));
        credentialList.add(new Credential("GE", "GE", 1));
        credentialList.add(new Credential("Admin", "Pass", 1));
        credentialList.add(new Credential("device", "apc", 1));
        credentialList.add(new Credential("apc", "apc", 1));
        credentialList.add(new Credential("root", "anni2013", 1));
        credentialList.add(new Credential("root", "xc3511", 1));
        credentialList.add(new Credential("root", "dreambox", 1));
        credentialList.add(new Credential("root", "vizxv", 2));
        credentialList.add(new Credential("admin", "1111111", 2));
        credentialList.add(new Credential("admin", "smcadmin", 0));
        credentialList.add(new Credential("admin", "4321", 0));
        credentialList.add(new Credential("888888", "888888", 1));
        credentialList.add(new Credential("666666", "666666", 1));
        credentialList.add(new Credential("ubnt", "ubnt", 0));
        credentialList.add(new Credential("admin", "22222", 0));
        credentialList.add(new Credential("adminttd", "adminttd", 2));
        credentialList.add(new Credential("root", "!root", 2));
        credentialList.add(new Credential("admin", "epicrouter", 1));
        credentialList.add(new Credential("tech", "tech", 0));
        credentialList.add(new Credential("manager", "manager", 0));
        credentialList.add(new Credential("smc", "smcadmin", 0));
        credentialList.add(new Credential("netscreen", "netscreen", 1));
        credentialList.add(new Credential("netopia", "netopia", 1));
        credentialList.add(new Credential("root", "888888", 2));
        credentialList.add(new Credential("root", "xmhdipc", 1));
        credentialList.add(new Credential("root", "juantech", 2));
        credentialList.add(new Credential("root", "123456", 1));
        credentialList.add(new Credential("root", "54321", 1));
        credentialList.add(new Credential("support", "support", 0));
        credentialList.add(new Credential("admin", "admin1234", 0));
        credentialList.add(new Credential("root", "1111", 2));
        credentialList.add(new Credential("admin", "1111", 2));
        credentialList.add(new Credential("root", "666666", 2));
        credentialList.add(new Credential("root", "1234", 2));
        credentialList.add(new Credential("root", "klv123", 0));
        credentialList.add(new Credential("Administrator", "admin", 1));
        credentialList.add(new Credential("service", "service", 0));
        credentialList.add(new Credential("guest", "guest", 2));
        credentialList.add(new Credential("guest", "12345", 2));
        credentialList.add(new Credential("admin1", "password", 1));
        credentialList.add(new Credential("administrator", "1234", 2));
        credentialList.add(new Credential("root", "klv1234", 2));
        credentialList.add(new Credential("root", "Zte521", 1));
        credentialList.add(new Credential("root", "hi3518", 1));
        credentialList.add(new Credential("root", "jvbzd", 1));
        credentialList.add(new Credential("root", "anko", 1));
        credentialList.add(new Credential("root", "zlxx.", 2));
        credentialList.add(new Credential("root", "7ujMko0vizxv", 1));
        credentialList.add(new Credential("root", "7ujMko0admin", 1));
        credentialList.add(new Credential("root", "system", 0));
        credentialList.add(new Credential("root", "ikwb", 1));
        credentialList.add(new Credential("root", "dreambox", 1));
        credentialList.add(new Credential("root", "user", 1));
        credentialList.add(new Credential("root", "realtek", 0));
        credentialList.add(new Credential("root", "00000000", 1));
        credentialList.add(new Credential("admin", "1234", 0));
        credentialList.add(new Credential("admin", "12345", 0));
        credentialList.add(new Credential("default", "OxhlwSG8", 2));
        credentialList.add(new Credential("admin", "tlJwpbo6", 2));
        credentialList.add(new Credential("default", "S2fGqNFs", 2));
        credentialList.add(new Credential("admin", "meinsm", 2));
        credentialList.add(new Credential("supervisor", "supervisor", 0));
        credentialList.add(new Credential("admin", "123456", 0));
        credentialList.add(new Credential("root", "zlxx", 2));
        credentialList.add(new Credential("dm", "telnet", 1));
        credentialList.add(new Credential("webguest", "1", 2));
        credentialList.add(new Credential("Liebert", "Liebert", 2));
        credentialList.add(new Credential("User", "User", 0));
        credentialList.add(new Credential("admin", "avocent", 2));
        credentialList.add(new Credential("root", "linux", 1));
        credentialList.add(new Credential("admin", "system", 1));
        credentialList.add(new Credential("user", "public", 1));
        credentialList.add(new Credential("admin", "private", 1));
        credentialList.add(new Credential("guest", "guest", 0));
        credentialList.add(new Credential("root", "root", 0));
        credentialList.add(new Credential("qbf77101", "hexakisoctahedron", 2));
        credentialList.add(new Credential("ftpuser", "password", 2));
        credentialList.add(new Credential("USER", "USER", 2));
        credentialList.add(new Credential("Basisk", "Basisk", 2));
        credentialList.add(new Credential("sconsole", "12345", 2));
        credentialList.add(new Credential("root", "5up", 2));
        credentialList.add(new Credential("root", "cat1029", 2));
        credentialList.add(new Credential("MayGion", "maygion.com", 2));
        credentialList.add(new Credential("admin", "cat1029", 2));
        credentialList.add(new Credential("admin", "ZmqVfoSIP", 2));
        credentialList.add(new Credential("default", "antslq", 2));
        credentialList.add(new Credential("admin", "microbusiness", 2));
        credentialList.add(new Credential("admin", "jvc", 2));
        credentialList.add(new Credential("root", "GM8182", 2));
        credentialList.add(new Credential("root", "uClinux", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgg19_c_dlwbr_dir300", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgn49_dlob_dir600b", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgn23_dlwbr_dir600b", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgn22_dlwbr_dir615", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgnd08_dlob_dir815", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgg15_di524", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgn39_dlob.hans_dir645", 2));
        credentialList.add(new Credential("Alphanetworks", "wapnd03cm_dkbs_dap2555", 2));
        credentialList.add(new Credential("Alphanetworks", "wapnd04cm_dkbs_dap3525", 2));
        credentialList.add(new Credential("Alphanetworks", "wapnd15_dlob_dap1522b", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgac01_dlob.hans_dir865", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgn23_dlwbr_dir300b", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgn28_dlob_dir412", 2));
        credentialList.add(new Credential("Alphanetworks", "wrgn39_dlob.hans_dir645_V1", 2));
        credentialList.add(new Credential("root", "oelinux123", 2));
        credentialList.add(new Credential("mg3500", "merlin", 2));
        credentialList.add(new Credential("root", "cxlinux", 2));
        credentialList.add(new Credential("root", "1001chin", 2));
        credentialList.add(new Credential("root", "china123", 2));
        credentialList.add(new Credential("admin", "symbol", 1));
        credentialList.add(new Credential("admin", "Symbol", 1));
        credentialList.add(new Credential("admin", "superuser", 0));
        credentialList.add(new Credential("admin", "admin123", 0));
        credentialList.add(new Credential("root", "20080826", 2));

        Collections.sort(credentialList, new Credential("","",1));

        return credentialList;
    }

    /**
     * Return Telnet Credentials MultiValuedMap
     * @return
     */
//    public MultiValuedMap<String, String> retrieveTelnetCredentialsMap()
//    {
//        MultiValuedMap<String, String> credentials = new HashSetValuedHashMap<String, String>();
//
//        // Based on seclist: https://github.com/danielmiessler/SecLists/blob/master/Passwords/Default-Credentials/telnet-betterdefaultpasslist.txt
//        credentials.put("root", "pass");
//        credentials.put("root", "calvin");
//        credentials.put("administrator", "password");
//        credentials.put("NetLinx", "password");
//        credentials.put("administrator", "Amx1234!");
//        credentials.put("amx", "password");
//        credentials.put("amx", "Amx1234!");
//        credentials.put("admin", "1988");
//        credentials.put("admin", "admin");
//        credentials.put("Administrator", "Vision2");
//        credentials.put("cisco", "cisco");
//        credentials.put("root", "f  idel123");
//        credentials.put("user", "user");
//        credentials.put("root", "default");
//        credentials.put("localadmin", "localadmin");
//        credentials.put("Root", "wago");
//        credentials.put("Admin", "wago");
//        credentials.put("User", "user");
//        credentials.put("Guest", "guest");
//        credentials.put("root", "rootpasswd");
//        credentials.put("admin", "password");
//        credentials.put("adtec", "none");
//        credentials.put("root", "timeserver");
//        credentials.put("root", "password");
//        credentials.put("Admin", "Su");
//        credentials.put("root", "admin");
//        credentials.put("admin", "motorola");
//        credentials.put("Admin", "5001");
//        credentials.put("User", "1001");
//        credentials.put("GE", "GE");
//        credentials.put("Admin", "Pass");
//        credentials.put("device", "apc");
//        credentials.put("apc", "apc");
//        credentials.put("root", "anni2013");
//        credentials.put("root", "xc3511");
//        credentials.put("root", "dreambox");
//        credentials.put("root", "vizxv");
//        credentials.put("admin", "1111111");
//        credentials.put("admin", "smcadmin");
//        credentials.put("admin", "4321");
//        credentials.put("888888", "888888");
//        credentials.put("666666", "666666");
//        credentials.put("ubnt", "ubnt");
//        credentials.put("admin", "22222");
//        credentials.put("adminttd", "adminttd");
//        credentials.put("root", "!root");
//        credentials.put("admin", "epicrouter");
//        credentials.put("tech", "tech");
//        credentials.put("manager", "manager");
//        credentials.put("smc", "smcadmin");
//        credentials.put("netscreen", "netscreen");
//        credentials.put("netopia", "netopia");
//        credentials.put("root", "888888");
//        credentials.put("root", "xmhdipc");
//        credentials.put("root", "juantech");
//        credentials.put("root", "123456");
//        credentials.put("root", "54321");
//        credentials.put("support", "support");
//        credentials.put("admin", "admin1234");
//        credentials.put("root", "1111");
//        credentials.put("admin", "1111");
//        credentials.put("root", "666666");
//        credentials.put("root", "1234");
//        credentials.put("root", "klv123");
//        credentials.put("Administrator", "admin");
//        credentials.put("service", "service");
//        credentials.put("guest", "guest");
//        credentials.put("guest", "12345");
//        credentials.put("admin1", "password");
//        credentials.put("administrator", "1234");
//        credentials.put("root", "klv1234");
//        credentials.put("root", "Zte521");
//        credentials.put("root", "hi3518");
//        credentials.put("root", "jvbzd");
//        credentials.put("root", "anko");
//        credentials.put("root", "zlxx.");
//        credentials.put("root", "7ujMko0vizxv");
//        credentials.put("root", "7ujMko0admin");
//        credentials.put("root", "system");
//        credentials.put("root", "ikwb");
//        credentials.put("root", "dreambox");
//        credentials.put("root", "user");
//        credentials.put("root", "realtek");
//        credentials.put("root", "00000000");
//        credentials.put("admin", "1234");
//        credentials.put("admin", "12345");
//        credentials.put("default", "OxhlwSG8");
//        credentials.put("admin", "tlJwpbo6");
//        credentials.put("default", "S2fGqNFs");
//        credentials.put("admin", "meinsm");
//        credentials.put("supervisor", "supervisor");
//        credentials.put("admin", "123456");
//        credentials.put("root", "zlxx");
//        credentials.put("dm", "telnet");
//        credentials.put("webguest", "1");
//        credentials.put("Liebert", "Liebert");
//        credentials.put("User", "User");
//        credentials.put("admin", "avocent");
//        credentials.put("root", "linux");
//        credentials.put("admin", "system");
//        credentials.put("user", "public");
//        credentials.put("admin", "private");
//        credentials.put("guest", "guest");
//        credentials.put("root", "root");
//        credentials.put("qbf77101", "hexakisoctahedron");
//        credentials.put("ftpuser", "password");
//        credentials.put("USER", "USER");
//        credentials.put("Basisk", "Basisk");
//        credentials.put("sconsole", "12345");
//        credentials.put("root", "5up");
//        credentials.put("root", "cat1029");
//        credentials.put("MayGion", "maygion.com");
//        credentials.put("admin", "cat1029");
//        credentials.put("admin", "ZmqVfoSIP");
//        credentials.put("default", "antslq");
//        credentials.put("admin", "microbusiness");
//        credentials.put("admin", "jvc");
//        credentials.put("root", "GM8182");
//        credentials.put("root", "uClinux");
//        credentials.put("Alphanetworks", "wrgg19_c_dlwbr_dir300");
//        credentials.put("Alphanetworks", "wrgn49_dlob_dir600b");
//        credentials.put("Alphanetworks", "wrgn23_dlwbr_dir600b");
//        credentials.put("Alphanetworks", "wrgn22_dlwbr_dir615");
//        credentials.put("Alphanetworks", "wrgnd08_dlob_dir815");
//        credentials.put("Alphanetworks", "wrgg15_di524");
//        credentials.put("Alphanetworks", "wrgn39_dlob.hans_dir645");
//        credentials.put("Alphanetworks", "wapnd03cm_dkbs_dap2555");
//        credentials.put("Alphanetworks", "wapnd04cm_dkbs_dap3525");
//        credentials.put("Alphanetworks", "wapnd15_dlob_dap1522b");
//        credentials.put("Alphanetworks", "wrgac01_dlob.hans_dir865");
//        credentials.put("Alphanetworks", "wrgn23_dlwbr_dir300b");
//        credentials.put("Alphanetworks", "wrgn28_dlob_dir412");
//        credentials.put("Alphanetworks", "wrgn39_dlob.hans_dir645_V1");
//        credentials.put("root", "oelinux123");
//        credentials.put("mg3500", "merlin");
//        credentials.put("root", "cxlinux");
//        credentials.put("root", "1001chin");
//        credentials.put("root", "china123");
//        credentials.put("admin", "symbol");
//        credentials.put("admin", "Symbol");
//        credentials.put("admin", "superuser");
//        credentials.put("admin", "admin123");
//        credentials.put("root", "20080826");
//
//        return credentials;
//    }

    public List<Credential> retrieveSSHCredentialsMap() {
        List<Credential> credentialList = new ArrayList<>();

        credentialList.add(new Credential("admin", "1234", 0));
        credentialList.add(new Credential("root", "calvin", 2));
        credentialList.add(new Credential("root", "root", 0));
        credentialList.add(new Credential("root", "toor", 0));
        credentialList.add(new Credential("administrator", "password", 0));
        credentialList.add(new Credential("NetLinx", "password", 1));
        credentialList.add(new Credential("administrator", "Amx1234!", 2));
        credentialList.add(new Credential("amx", "password", 2));
        credentialList.add(new Credential("amx", "Amx1234!", 2));
        credentialList.add(new Credential("admin", "1988", 2));
        credentialList.add(new Credential("admin", "admin", 0));
        credentialList.add(new Credential("Administrator", "Vision2", 2));
        credentialList.add(new Credential("cisco", "cisco", 0));
        credentialList.add(new Credential("c-comatic", "xrtwk318", 2));
        credentialList.add(new Credential("root", "qwasyx21", 2));
        credentialList.add(new Credential("admin", "insecure", 2));
        credentialList.add(new Credential("pi", "raspberry", 1));
        credentialList.add(new Credential("user", "user", 0));
        credentialList.add(new Credential("root", "default", 0));
        credentialList.add(new Credential("root", "leostream", 2));
        credentialList.add(new Credential("leo", "leo", 2));
        credentialList.add(new Credential("localadmin", "localadmin", 1));
        credentialList.add(new Credential("fwupgrade", "fwupgrade", 1));
        credentialList.add(new Credential("root", "rootpasswd", 1));
        credentialList.add(new Credential("admin", "password", 0));
        credentialList.add(new Credential("root", "timeserver", 1));
        credentialList.add(new Credential("admin", "motorola", 1));
        credentialList.add(new Credential("cloudera", "cloudera", 2));
        credentialList.add(new Credential("root", "p@ck3tf3nc3", 2));
        credentialList.add(new Credential("apc", "apc", 1));
        credentialList.add(new Credential("device", "apc", 1));
        credentialList.add(new Credential("eurek", "eurek", 1));
        credentialList.add(new Credential("netscreen", "netscreen", 1));
        credentialList.add(new Credential("admin", "avocent", 2));
        credentialList.add(new Credential("root", "linux", 0));
        credentialList.add(new Credential("sconsole", "12345", 2));
        credentialList.add(new Credential("root", "5up", 1));
        credentialList.add(new Credential("cirros", "cubswin", 2));
        credentialList.add(new Credential("root", "uClinux", 2));
        credentialList.add(new Credential("root", "alpine", 2));
        credentialList.add(new Credential("root", "dottie", 2));
        credentialList.add(new Credential("root", "arcsight", 2));
        credentialList.add(new Credential("root", "unitrends1", 2));
        credentialList.add(new Credential("vagrant", "vagrant", 2));
        credentialList.add(new Credential("root", "vagrant", 2));
        credentialList.add(new Credential("m202", "m202", 2));
        credentialList.add(new Credential("demo", "fai", 2));
        credentialList.add(new Credential("root", "fai", 2));
        credentialList.add(new Credential("root", "ceadmin", 1));
        credentialList.add(new Credential("maint", "password", 1));
        credentialList.add(new Credential("root", "palosanto", 2));
        credentialList.add(new Credential("root", "ubuntu1404", 1));
        credentialList.add(new Credential("root", "cubox-i", 2));
        credentialList.add(new Credential("debian", "debian", 0));
        credentialList.add(new Credential("root", "debian", 1));
        credentialList.add(new Credential("root", "xoa", 1));
        credentialList.add(new Credential("root", "sipwise", 2));
        credentialList.add(new Credential("debian", "temppwd", 2));
        credentialList.add(new Credential("root", "sixaola", 2));
        credentialList.add(new Credential("debian", "sixaola", 2));
        credentialList.add(new Credential("myshake", "shakeme", 2));
        credentialList.add(new Credential("stackato", "stackato", 2));
        credentialList.add(new Credential("root", "screencast", 1));
        credentialList.add(new Credential("root", "stxadmin", 2));
        credentialList.add(new Credential("root", "nosoup4u", 2));
        credentialList.add(new Credential("root", "indigo", 2));
        credentialList.add(new Credential("root", "video", 1));
        credentialList.add(new Credential("default", "video", 1));
        credentialList.add(new Credential("default", "none", 0));
        credentialList.add(new Credential("ftp", "video", 0));
        credentialList.add(new Credential("nexthink", "123456", 1));
        credentialList.add(new Credential("ubnt", "ubnt", 0));
        credentialList.add(new Credential("root", "ubnt", 0));
        credentialList.add(new Credential("sansforensics", "forensics", 2));
        credentialList.add(new Credential("elk_user", "forensics", 1));
        credentialList.add(new Credential("osboxes", "osboxes.org", 2));
        credentialList.add(new Credential("root", "osboxes.org", 1));
        credentialList.add(new Credential("sans", "training", 1));
        credentialList.add(new Credential("user", "password", 0));
        credentialList.add(new Credential("misp", "Password1234", 2));
        credentialList.add(new Credential("hxeadm", "HXEHana1", 1));
        credentialList.add(new Credential("acitoolkit", "acitoolkit", 2));
        credentialList.add(new Credential("osbash", "osbash", 2));
        credentialList.add(new Credential("enisa", "enisa", 2));
        credentialList.add(new Credential("geosolutions", "Geos", 2));
        credentialList.add(new Credential("pyimagesearch", "deeplearning", 2));
        credentialList.add(new Credential("root", "NM1$88", 2));
        credentialList.add(new Credential("remnux", "malware", 2));
        credentialList.add(new Credential("hunter", "hunter", 1));
        credentialList.add(new Credential("plexuser", "rasplex", 1));
        credentialList.add(new Credential("root", "openelec", 2));
        credentialList.add(new Credential("root", "rasplex", 1));
        credentialList.add(new Credential("root", "plex", 1));
        credentialList.add(new Credential("root", "openmediavault", 2));
        credentialList.add(new Credential("root", "ys123456", 2));
        credentialList.add(new Credential("root", "libreelec", 2));
        credentialList.add(new Credential("openhabian", "openhabian", 0));
        credentialList.add(new Credential("admin", "ManagementConsole2015", 2));
        credentialList.add(new Credential("public", "publicpass", 1));
        credentialList.add(new Credential("admin", "hipchat", 2));
        credentialList.add(new Credential("nao", "nao", 2));
        credentialList.add(new Credential("support", "symantec", 1));
        credentialList.add(new Credential("root", "max2play", 2));
        credentialList.add(new Credential("admin", "pfsense", 2));
        credentialList.add(new Credential("root", "root01", 1));
        credentialList.add(new Credential("root", "nas4free", 1));
        credentialList.add(new Credential("USERID", "PASSW0RD", 1));
        credentialList.add(new Credential("Administrator", "p@ssw0rd", 1));
        credentialList.add(new Credential("root", "freenas", 1));
        credentialList.add(new Credential("root", "cxlinux", 1));
        credentialList.add(new Credential("admin", "symbol", 1));
        credentialList.add(new Credential("admin", "Symbol", 1));
        credentialList.add(new Credential("admin", "superuser", 0));
        credentialList.add(new Credential("admin", "admin123", 0));
        credentialList.add(new Credential("root", "D13HH[", 0));
        credentialList.add(new Credential("root", "blackarch", 2));
        credentialList.add(new Credential("root", "dasdec1", 2));
        credentialList.add(new Credential("root", "7ujMko0admin", 2));
        credentialList.add(new Credential("root", "7ujMko0vizxv", 2));
        credentialList.add(new Credential("root", "Zte521", 2));
        credentialList.add(new Credential("root", "zlxx.", 2));
        credentialList.add(new Credential("root", "compass", 2));
        credentialList.add(new Credential("hacker", "compass", 2));
        credentialList.add(new Credential("samurai", "samurai", 1));
        credentialList.add(new Credential("ubuntu", "ubuntu", 0));
        credentialList.add(new Credential("root", "openvpnas", 2));
        credentialList.add(new Credential("misp", "Password1234", 2));
        credentialList.add(new Credential("root", "wazuh", 2));
        credentialList.add(new Credential("student", "password123", 2));
        credentialList.add(new Credential("root", "roottoor", 1));
        credentialList.add(new Credential("centos", "reverse", 1));
        credentialList.add(new Credential("root", "reverse", 1));

        Collections.sort(credentialList, new Credential("","",1));

        return credentialList;
    }

        /**
         * Return Telnet Credentials MultiValuedMap
         * @return
         */
//    public MultiValuedMap<String, String> retrieveSSHCredentialsMap() {
//        MultiValuedMap<String, String> credentials = new HashSetValuedHashMap<String, String>();
//
//        // Based on seclist: https://github.com/danielmiessler/SecLists/blob/master/Passwords/Default-Credentials/ssh-betterdefaultpasslist.txt
//        credentials.put("admin", "1234");
//        credentials.put("root", "calvin");
//        credentials.put("root", "root");
//        credentials.put("root", "toor");
//        credentials.put("administrator", "password");
//        credentials.put("NetLinx", "password");
//        credentials.put("administrator", "Amx1234!");
//        credentials.put("amx", "password");
//        credentials.put("amx", "Amx1234!");
//        credentials.put("admin", "1988");
//        credentials.put("admin", "admin");
//        credentials.put("Administrator", "Vision2");
//        credentials.put("cisco", "cisco");
//        credentials.put("c-comatic", "xrtwk318");
//        credentials.put("root", "qwasyx21");
//        credentials.put("admin", "insecure");
//        credentials.put("pi", "raspberry");
//        credentials.put("user", "user");
//        credentials.put("root", "default");
//        credentials.put("root", "leostream");
//        credentials.put("leo", "leo");
//        credentials.put("localadmin", "localadmin");
//        credentials.put("fwupgrade", "fwupgrade");
//        credentials.put("root", "rootpasswd");
//        credentials.put("admin", "password");
//        credentials.put("root", "timeserver");
//        credentials.put("admin", "motorola");
//        credentials.put("cloudera", "cloudera");
//        credentials.put("root", "p@ck3tf3nc3");
//        credentials.put("apc", "apc");
//        credentials.put("device", "apc");
//        credentials.put("eurek", "eurek");
//        credentials.put("netscreen", "netscreen");
//        credentials.put("admin", "avocent");
//        credentials.put("root", "linux");
//        credentials.put("sconsole", "12345");
//        credentials.put("root", "5up");
//        credentials.put("cirros", "cubswin");
//        credentials.put("root", "uClinux");
//        credentials.put("root", "alpine");
//        credentials.put("root", "dottie");
//        credentials.put("root", "arcsight");
//        credentials.put("root", "unitrends1");
//        credentials.put("vagrant", "vagrant");
//        credentials.put("root", "vagrant");
//        credentials.put("m202", "m202");
//        credentials.put("demo", "fai");
//        credentials.put("root", "fai");
//        credentials.put("root", "ceadmin");
//        credentials.put("maint", "password");
//        credentials.put("root", "palosanto");
//        credentials.put("root", "ubuntu1404");
//        credentials.put("root", "cubox-i");
//        credentials.put("debian", "debian");
//        credentials.put("root", "debian");
//        credentials.put("root", "xoa");
//        credentials.put("root", "sipwise");
//        credentials.put("debian", "temppwd");
//        credentials.put("root", "sixaola");
//        credentials.put("debian", "sixaola");
//        credentials.put("myshake", "shakeme");
//        credentials.put("stackato", "stackato");
//        credentials.put("root", "screencast");
//        credentials.put("root", "stxadmin");
//        credentials.put("root", "nosoup4u");
//        credentials.put("root", "indigo");
//        credentials.put("root", "video");
//        credentials.put("default", "video");
//        credentials.put("default", "none");
//        credentials.put("ftp", "video");
//        credentials.put("nexthink", "123456");
//        credentials.put("ubnt", "ubnt");
//        credentials.put("root", "ubnt");
//        credentials.put("sansforensics", "forensics");
//        credentials.put("elk_user", "forensics");
//        credentials.put("osboxes", "osboxes.org");
//        credentials.put("root", "osboxes.org");
//        credentials.put("sans", "training");
//        credentials.put("user", "password");
//        credentials.put("misp", "Password1234");
//        credentials.put("hxeadm", "HXEHana1");
//        credentials.put("acitoolkit", "acitoolkit");
//        credentials.put("osbash", "osbash");
//        credentials.put("enisa", "enisa");
//        credentials.put("geosolutions", "Geos");
//        credentials.put("pyimagesearch", "deeplearning");
//        credentials.put("root", "NM1$88");
//        credentials.put("remnux", "malware");
//        credentials.put("hunter", "hunter");
//        credentials.put("plexuser", "rasplex");
//        credentials.put("root", "openelec");
//        credentials.put("root", "rasplex");
//        credentials.put("root", "plex");
//        credentials.put("root", "openmediavault");
//        credentials.put("root", "ys123456");
//        credentials.put("root", "libreelec");
//        credentials.put("openhabian", "openhabian");
//        credentials.put("admin", "ManagementConsole2015");
//        credentials.put("public", "publicpass");
//        credentials.put("admin", "hipchat");
//        credentials.put("nao", "nao");
//        credentials.put("support", "symantec");
//        credentials.put("root", "max2play");
//        credentials.put("admin", "pfsense");
//        credentials.put("root", "root01");
//        credentials.put("root", "nas4free");
//        credentials.put("USERID", "PASSW0RD");
//        credentials.put("Administrator", "p@ssw0rd");
//        credentials.put("root", "freenas");
//        credentials.put("root", "cxlinux");
//        credentials.put("admin", "symbol");
//        credentials.put("admin", "Symbol");
//        credentials.put("admin", "superuser");
//        credentials.put("admin", "admin123");
//        credentials.put("root", "D13HH[");
//        credentials.put("root", "blackarch");
//        credentials.put("root", "dasdec1");
//        credentials.put("root", "7ujMko0admin");
//        credentials.put("root", "7ujMko0vizxv");
//        credentials.put("root", "Zte521");
//        credentials.put("root", "zlxx.");
//        credentials.put("root", "compass");
//        credentials.put("hacker", "compass");
//        credentials.put("samurai", "samurai");
//        credentials.put("ubuntu", "ubuntu");
//        credentials.put("root", "openvpnas");
//        credentials.put("misp", "Password1234");
//        credentials.put("root", "wazuh");
//        credentials.put("student", "password123");
//        credentials.put("root", "roottoor");
//        credentials.put("centos", "reverse");
//        credentials.put("root", "reverse");
//
//        return credentials;
//    }
}
