package cc.robotdreams;

public class Main
{
    private BankApplication bankApp;
    static public void main(String[] args) {

    }

    public void processWrapper(String accountId, int amount, String currency) throws Exception {

        BankApplication bankApp = new BankApplication();
        bankApp.process(accountId,amount,currency);

        try {
            processWrapper("accountId000", 50, "USD");
            processWrapper("accountId003", 250, "HRV");
            processWrapper("accountId001", 50, "EUR");
            processWrapper("accountId001", 50, "USD");
            processWrapper("accountId001", 2000, "USD");

        } catch (WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
    System.out.println("Дякуємо, що скористалися нашим сервісом");

        }

   }
}



