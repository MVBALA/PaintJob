public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            int buckets = getBucketCount(width, height, areaPerBucket);
            return Math.round(buckets - extraBuckets);
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double buckets = ((width * height) / areaPerBucket);
            double a = Math.ceil(buckets);
            return Math.round((int) a);
        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double buckets = Math.ceil(area / areaPerBucket);

            return (int) buckets;
        }

    }
}
