package Infy_Excercise;

import java.util.regex.*;

// WebAddressValidator class to validate web addresses with multiple rules
class WebAddressValidator {
    
    // Regular expressions for different web address formats
    private static final String[] REGEX_PATTERNS = {
        "^(http|https)://(www\\.)?[a-zA-Z0-9]+\\.(com|org|net)$",   // Basic URL with common TLDs
        "^(http|https)://[a-zA-Z0-9.-]+\\.(in|us|uk|au|ca|gov)$",   // Country code domains
        "^(http|https)://[a-zA-Z0-9.-]+(:[0-9]{2,5})?$",           // URLs with port numbers
        "^(http|https)://[a-zA-Z0-9.-]+\\.[a-z]{2,6}/[a-zA-Z0-9./_-]*$",  // URLs with paths
        "^(http|https)://[a-zA-Z0-9.-]+\\.[a-z]{2,6}/\\?[a-zA-Z0-9=&]+$", // URLs with query parameters
        "^(http|https)://[a-zA-Z0-9.-]+\\.[a-z]{2,6}/#[a-zA-Z0-9_-]+$",   // URLs with fragments
        "^(http|https)://[0-9]{1,3}(\\.[0-9]{1,3}){3}$",           // IP-based URLs (e.g., http://192.168.1.1)
        "^(http|https)://[a-zA-Z0-9]+\\.(edu|gov|mil)$",           // Educational and government domains
        "^(http|https)://([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,6}$",        // Subdomains (e.g., sub.example.com)
        "^(http|https)://(www\\.)?[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$"  // Handles hyphens in domain names
    };

    // Method to validate web address against multiple patterns
    public boolean isValidWebAddress(String webAddress) {
        for (String regex : REGEX_PATTERNS) {
            if (Pattern.compile(regex).matcher(webAddress).matches()) {
                return true; // If any regex matches, it's a valid web address
            }
        }
        return false; // No match found
    }
}

// Tester class
public class WebAddressValidatorApp {
    public static void main(String[] args) {
        WebAddressValidator validator = new WebAddressValidator();

        // Test cases for different scenarios
        String[] testCases = {
            "http://www.infosys.com",           //  Valid (Basic)
            "https://sub.example.in",           //  Valid (Subdomain + Country Code)
            "http://example.org",               //  Valid (No WWW)
            "https://www.testsite.net",         //  Valid (HTTPS)
            "http://192.168.1.1",               //  Valid (IP-based URL)
            "https://example.com:8080",         //  Valid (Port Number)
            "http://example.com/home",          //  Valid (Path)
            "https://example.com?query=123",    //  Valid (Query Parameters)
            "http://example.edu",               //  Valid (.edu)
            "https://example.com#section1",     //  Valid (Fragment)
            "http://invalid_domain",            //  Invalid (No TLD)
            "ftp://example.com",                //  Invalid (Only HTTP/HTTPS allowed)
            "http://www.example.unknown",       //  Invalid (Unknown TLD)
            "://www.missingprotocol.com",       //  Invalid (Missing protocol)
        };

        // Checking and printing results
        for (String test : testCases) {
            System.out.println(test + " -> " + (validator.isValidWebAddress(test) ? "Valid" : "Invalid"));
        }
    }
}
