public class containermaxwater {
    public static void main(String[] args) {
        int d = maxArea();
        System.out.println(d);
    }


    public  static int maxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            // find area of container is of rectangle shape so L*W.
            int area =
                    Math.min(height[left], height[right])
                            * (right - left);
            // frist loop 1*8
            //second loop 7*7
            //third loop 3*6 so on.

            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
