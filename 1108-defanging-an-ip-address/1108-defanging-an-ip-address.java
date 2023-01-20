class Solution {
    public String defangIPaddr(String address) {
         
        String[] parts = address.split("\\.");
        StringBuilder result = new StringBuilder();
        for(String part : parts) {
            result.append(part);
            if(part != parts[parts.length - 1]) {
                result.append("[.]");
            }
        }
        return result.toString();
    }
}
    