class RnaTranscription {

    String transcribe(String dnaStrand) {
        String ans="";
        for(int i=0 ;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i)=='G')
            {
                ans+="C";
            }
            else if(dnaStrand.charAt(i)=='C')
            {
                ans+="G";
            }
            else if(dnaStrand.charAt(i)=='T')
            {
                ans+="A";
            }
            else if(dnaStrand.charAt(i)=='A')
            {
                ans+="U";
            }
        }
        return ans;
    }

}
