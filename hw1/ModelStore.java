package hw1;

public class ModelStore {
    public class PoligonalModel models;
    public class Scene scenes;
    public class Flash flashes;
    public class  Camera cameras;
    private class  IModelChangeObserver changeObservers;

    public ModelStore() {
        this.models = new PoligonalModel();
        this.scenese = new Scene();
        this.flashes = new Flash();
        this.cameras = new  Camera();
        this.changeObservers = new IModelChangeObserver();

    }


    public Scene getScene(int id) {
        return null;
    }

    public void notifyChange(IModelChanger changer) {

    }
}
