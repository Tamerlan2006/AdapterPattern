public class TranslatorAdapter implements RussianSpeaking{
    private EnglishSpeaking english;

    public TranslatorAdapter() {
        this.english = new EnglishSpeaking();
    }

    @Override
    public void speakRussian(String text) {
        String translated = translateToEnglish(text);
        english.speakEnglish(translated);
    }

    public String translateToEnglish(String russianText) {
        if (russianText.equalsIgnoreCase("Привет, меня зовут Тамерлан!")) {
            return "Hello, my name is Tamerlan!";
        }
        return "INVALID to translate";
    }
}
