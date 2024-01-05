for (int i = 1; i <= str.length(); i++) {
            
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
               
                result.append(str.charAt(i - 1));
                result.append(count);
               
                count = 1;
            }
        }

        return result.toString();
	}
	
 }