interfaces {
    ethernet eth0 {
        address 200.100.100.2/24
        description WAN
        hw-id 50:00:00:02:00:00
    }
    ethernet eth1 {
        hw-id 50:00:00:02:00:01
    }
    ethernet eth2 {
        hw-id 50:00:00:02:00:02
    }
    ethernet eth3 {
        hw-id 50:00:00:02:00:03
    }
    loopback lo {
    }
}
nat {
    source {
    }
}
protocols {
    static {
        route 0.0.0.0/0 {
            next-hop 200.100.100.1 {
                distance 1
            }
        }
    }
}
service {
    dns {
    }
}
system {
    config-management {
        commit-revisions 100
    }
    conntrack {
        modules {
            ftp
            h323
            nfs
            pptp
            sip
            sqlnet
            tftp
        }
    }
    console {
        device ttyS0 {
            speed 115200
        }
    }
    host-name vyos
    login {
        user vyos {
            authentication {
                encrypted-password $6$2EdfAroxO/hP$gIjKksJLGEb3FTW65od9qcAQJ9zONz4sQdPYVSyclSO91IjC9fWZkB49D3V7wqEsB8rA5.SNZXHASgH2O.ltk0
                plaintext-password ""
            }
        }
    }
    ntp {
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    syslog {
        global {
            facility all {
                level info
            }
            facility protocols {
                level debug
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "broadcast-relay@1:cluster@1:config-management@1:conntrack@3:conntrack-sync@2:dhcp-relay@2:dhcp-server@6:dhcpv6-server@1:dns-forwarding@3:firewall@5:https@2:interfaces@22:ipoe-server@1:ipsec@5:isis@1:l2tp@3:lldp@1:mdns@1:nat@5:ntp@1:pppoe-server@5:pptp@2:qos@1:quagga@8:rpki@1:salt@1:snmp@2:ssh@2:sstp@3:system@21:vrrp@2:vyos-accel-ppp@2:wanloadbalance@3:webproxy@2:zone-policy@1"
// Release version: 1.3.1