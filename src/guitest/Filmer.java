/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

public class Filmer {

        private int id;
        private String titel;
        private String genre;
        private String regissör;
        private double iMDb;
        private String längd;

        public Filmer(int Id, String Titel, String Genre, String Regissör, double IMDb, String Längd) {
            this.id = Id;
            this.titel = Titel;
            this.genre = Genre;
            this.regissör = Regissör;
            this.iMDb = IMDb;
            this.längd = Längd;
        }

        public int getId() {
            return this.id;
        }

        public String getTitel() {
            return this.titel;
        }

        public String getGenre() {
            return this.genre;
        }

        public String getRegissör() {
            return this.regissör;
        }

        public double getIMDb() {
            return this.iMDb;
        }

        public String getLängd() {
            return this.längd;
        }
    }