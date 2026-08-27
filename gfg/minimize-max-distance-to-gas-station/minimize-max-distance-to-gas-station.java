class Solution {
  public:

    // Returns the number of new stations needed so that
    // the maximum distance between adjacent stations is <= mid.
    int func(vector<int>& arr, double mid, int k)
    {
        int n = arr.size();
        int count = 0;

        // Traverse every gap between consecutive stations
        for (int i = 0; i < n - 1; i++)
        {
            // Number of stations required in the current gap
            int no = (arr[i + 1] - arr[i]) / mid;

            // If the gap is exactly divisible by mid,
            // one less station is actually needed
            if ((arr[i + 1] - arr[i]) == mid * no)
                no--;

            count += no;

            // Early exit if stations required already exceed K
            if (count > k)
                return count;
        }

        return count;
    }

    double minMaxDist(vector<int> &stations, int K) {

        // Binary search range:
        // minimum possible answer = 0
        // maximum possible answer = largest existing gap
        double low = 0;
        double high = 0;

        // Find the maximum gap between consecutive stations
        for (int i = 0; i < stations.size() - 1; i++)
        {
            double diff = stations[i + 1] - stations[i];
            high = max(high, diff);
        }

        // Required precision for binary search
        double diff = 1e-6;

        while (high - low > diff)
        {
            // Candidate maximum distance
            double mid = (low + high) / 2.0;

            // Stations needed for this maximum distance
            int cnt = func(stations, mid, K);

            // Need more than K stations -> distance is too small
            if (cnt > K)
                low = mid;

            // Possible answer, try to minimize it further
            else
                high = mid;
        }

        // Minimum possible maximum distance
        return high;
    }
};