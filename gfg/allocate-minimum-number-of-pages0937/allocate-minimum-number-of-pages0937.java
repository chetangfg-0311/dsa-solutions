// The limit can be large, so accept it as long long
    bool helper(vector<int>& books, long long limit, int stud){ 
        int k = 1; 
        long long pages = 0; 
        
        for(int i = 0; i < books.size(); i++){ 
            if(pages + books[i] <= limit){ 
                pages = pages + books[i]; 
            } 
            else{ 
                k++; 
                pages = books[i]; 
                if(k > stud){ 
                    return false; 
                } 
            } 
        } 
        return true; 
    } 

    int findPages(vector<int> &arr, int k) { 
        int n = arr.size(); 
        if(n < k){ 
            return -1; 
        } 
        
        // FIX: Use long long to prevent integer overflow during summation
        long long low = 0;
        long long high = 0;
        
        for(int i = 0; i < n; i++){ 
            low = max(low, (long long)arr[i]); 
            high += arr[i]; 
        } 
        
        long long res = -1; 
        while(low <= high){ 
            long long guess = low + (high - low) / 2; 
            
            if(helper(arr, guess, k)){ 
                res = guess; 
                high = guess - 1; 
            } 
            else{ 
                low = guess + 1; 
            } 
        } 
        // Cast back to int as required by the function signature
        return (int)res; 
    }