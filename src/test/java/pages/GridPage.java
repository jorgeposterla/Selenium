package pages;

public class GridPage extends BasePage{

    private String cell = "ReactTable -striped -highlight";

    public GridPage() {
        super(driver);
    }

    public void navigateToGrid(){
        navigateTo("https://demoqa.com/webtables");
    }

    public String getValueFromGrid(int row, int column){
        return getValueFromTable(cell, row, column);
    }
    
}
