public class LeafEntry extends Entry {
    public long recordId;

    public LeafEntry(long recordId, BoundingBox boundingBox) {
        super(boundingBox);
        this.recordId = recordId;
    }

    @Override
    public BoundingBox getBoundingBox() {
        return super.getBoundingBox();
    }

    @Override
    public void showEntry() {
        System.out.println("Record ID:" + recordId);
        super.showEntry();
    }

    public long getEntryId() {
        return recordId;
    }
}
