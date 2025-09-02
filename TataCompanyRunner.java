 class TataCompanyRunner {
    public static void main(String[] args) {
        TataCompany.companyInfo();

        TataCompany t1 = new TataCompany();
        TataCompany t2 = new TataCompany("Tata Motors", 50);
        TataCompany t3 = new TataCompany(50, "Tata Steel", 1500.75f);
        TataCompany t4 = new TataCompany(1200.5, "Tata Consultancy", 3000.5f, 120);
        TataCompany t5 = new TataCompany(500L, 1200.5, "Tata Power", 2000.0f, 80);
        TataCompany t6 = new TataCompany('A', 500L, 1200.5, "Tata Chemicals", 900.25f, 45);
        TataCompany t7 = new TataCompany(true, 'A', 500L, 1200.5, "Tata Sons", 10000.0f, 200);
    }
	}