package com.example.projectfinal;

public class mockQuestionAnswer5 {
    public static String question[]= {
            "Q1. What does a VLAN do?",
            "Q2. What command is used to create a backup configuration?",
            "Q3. What flavor of Network Address Translation can be used to have one IP address allow many users to connect to the global Internet?",
            "Q4. Routers operate at layer _____. LAN switches operate at layer _____. Ethernet hubs operate at layer _____. Word processing operates at layer _____",
            "Q5. Segmentation of a data stream happens at which layer of the OSI model?",
            "Q6. Which statements are true regarding ICMP packets?\n" +
                    "i. They acknowledge receipt of a TCP segment.\n" +
                    "ii. They guarantee datagram delivery.\n" +
                    "iii. They can provide hosts with information about network problems.\n" +
                    "iv. They are encapsulated within IP datagrams.",
            "Q7. You have an interface on a router with the IP address of 192.168.192.10/29. Including the router interface, how many hosts can have IP addresses on the LAN attached to the router interface?",
            "Q8. Which of the following commands sets the secret password to Cisco?",
            "Q9. You copy a configuration from a network host to a router's RAM. The configuration looks correct, yet it is not working at all. What could the problem be?",
            "Q10. Where are EIGRP successor routes stored?",
            "Q11. Which of the following is true regarding VTP?",
            "Q12. Which command will display the CHAP authentication process as it occurs between two routers in the network?",
            "Q13. Which of the following describes the creation of private networks across the Internet, enabling privacy and tunneling of non-TCP/IP protocols?",
            "Q14. You have a network that needs 29 subnets while maximizing the number of host addresses available on each subnet. How many bits must you borrow from the host field to provide the correct subnet mask?",
            "Q15. To test the IP stack on your local host, which IP address would you ping?"
    };
    public static String choices[][]={
            {"Acts as the fastest port to all servers.","Provides multiple collision domains on one switch port","Breaks up broadcast domains in a layer 2 switch internetwork","\n" +
                    "Provides multiple broadcast domains within a single collision domain."},
            {"copy running backup","copy running-config startup-config","config mem","wr mem"},
            {"NAT","Static","Dynamic","PAT"},
            {"3, 3, 1, 7","3, 2, 1, none","3, 2, 1, 7","3, 3, 2, none"},
            {"Physical","Data Link","Network","Transport"},
            {"i only","ii and iii","iii and iv","ii, iii and iv"},
            {"6","8","30","32"},
            {"enable secret password Cisco","enable secret cisco","enable secret Cisco","enable password Cisco"},
            {"You copied the wrong configuration into RAM","You copied the configuration into flash memory instead","The copy did not override the shutdown command in running-config","The IOS became corrupted after the copy command was initiated"},
            {"In the routing table only","In the neighbor table only","In the topology table only","In the routing table and the topology table"},
            {"All switches are VTP servers by default.","All switches are VTP transparent by default.","VTP is on by default with a domain name of Cisco on all Cisco switches.","All switches are VTP clients by default."},
            {"show chap authentication","show interface serial 0","debug ppp authentication","debug chap authentication"},
            {"HDLC","Cable","VPN","IPSec"},
            {"2","3","4","5"},
            {"127.0.0.0","1.0.0.127","127.0.0.1","127.0.0.255"}

    };
    public static String correctAnswer[]={
            "Breaks up broadcast domains in a layer 2 switch internetwork",
            "copy running-config startup-config",
            "PAT",
            "3, 2, 1, none",
            "Transport",
            "iii and iv",
            "6",
            "enable secret Cisco",
            "The copy did not override the shutdown command in running-config",
            "In the routing table and the topology table",
            "All switches are VTP servers by default.",
            "debug ppp authentication",
            "VPN",
            "5",
            "127.0.0.1"

    };
    public static String desAns[]={
            "Breaks up broadcast domains in a layer 2 switch internetwork",
            "copy running-config startup-config",
            "PAT",
            "3, 2, 1, none",
            "Transport",
            "iii and iv",
            "6",
            "enable secret Cisco",
            "The copy did not override the shutdown command in running-config",
            "In the routing table and the topology table",
            "All switches are VTP servers by default.",
            "debug ppp authentication",
            "VPN",
            "A 240 mask is 4 subnet bits and provides 16 subnets, each with 14 hosts. We need more subnets, so let's add subnet bits. One more subnet bit would be a 248 mask. This provides 5 subnet bits (32 subnets) with 3 host bits (6 hosts per subnet).",
            "127.0.0.1"

    };
}
