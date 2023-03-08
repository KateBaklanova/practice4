package com.example.pr4;

public class Words {

        private String theme;  // столица
        private int img; // ресурс флага

        public Words(String capital, int flag){
            this.theme=capital;
            this.img=flag;
        }

        public String getCapital() {
            return this.theme;
        }

        public void setCapital(String capital) {
            this.theme = capital;
        }

        public int getFlagResource() {
            return this.img;
        }

        public void setFlagResource(int flagResource) {
            this.img = flagResource;
        }
    }

