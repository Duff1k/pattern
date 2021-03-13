public interface Observed {
    public void addObserver(Observer obserever);
    public void removeObserver(Observer obserever);
    public void notifyObservers();;
}
