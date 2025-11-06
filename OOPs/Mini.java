    public  class Mini extends Cab1
    {
        int distance;

        public Mini(int distance)
        {
            super(10);
            this.distance = distance;
        }

        public void fare()
        {
            System.out.println(".....TOTAL FARE : Rs. " + this.price*this.distance);
        }
        
    }
