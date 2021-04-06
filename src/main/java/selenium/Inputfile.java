package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.sikuli.script.FindFailed;

public class Inputfile {
	
	private static String firstName = "";
	private static String lastName = "";

	private static String PSID = "";
	private static String AID = "";
	private static String DOS = "";

	static FileOutputStream failedLog = null;

	public static void main(String[] args)throws FindFailed, InterruptedException, IOException
	{
		// TODO Auto-generated method stub
		File inputFile = new File("/home/administrator/eclipse-workspace/Demomaven/input/file1_to_process.xlsx");

		FileInputStream file = new FileInputStream(inputFile);

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		int topCount = sheet.getPhysicalNumberOfRows();

		// Iterate through each rows one by one
		Iterator<Row> rowIterator = sheet.iterator();
		int count = 0;
		int headerAvoid = 0;
		while (rowIterator.hasNext()) {

			if (headerAvoid == 0) {
				rowIterator.next();
			}
			headerAvoid = 1;
			Row row = rowIterator.next();

			// For each row, iterate through all the columns
			Iterator<Cell> cellIterator = row.cellIterator();
			boolean num_flag = false;
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				// Check the cell type and format accordingly
				cell.setCellType(Cell.CELL_TYPE_STRING);
				if ((cell.getCellType() == Cell.CELL_TYPE_STRING)) {
					count = count + 1;

					if (count == 1) {
						firstName = cell.getStringCellValue();
						continue;
					}

					if (count == 2) {
						lastName = cell.getStringCellValue();
						continue;
					}
					//DOS - 19/12/2020
					if (count == 3) {
						PSID = cell.getStringCellValue();
						continue;
					}

					if (count == 4) {
						AID = cell.getStringCellValue();
						continue;
					}

					if (count == 5) {
						try {
							DOS = cell.getStringCellValue();

							if (DOS.contains("/")) {
								//System.out.println("Date in correct format");
							} else {
								throw new Exception("Date is in incorrect format.");
							}
						} catch (Exception e) {
							//System.out.println("Converting to correct format");
							Date javaDate = DateUtil.getJavaDate(Double.parseDouble(cell.getStringCellValue()));
							DOS = new SimpleDateFormat("dd/MM/yyyy").format(javaDate);

						}
						continue;

					}

					if (count == 6) {
						// ERRNOTE = cell.getStringCellValue();
						count = 0;
						continue;
					}
					count = 0;
				}
			}

			System.out.println("firstName  - " + firstName);
			System.out.println("lastName - " + lastName);
			System.out.println("PSID - " + PSID);
			System.out.println("AID - " + AID);
			System.out.println("DOS - " + DOS);
			System.out.println();

		}
		file.close();

	}

}
