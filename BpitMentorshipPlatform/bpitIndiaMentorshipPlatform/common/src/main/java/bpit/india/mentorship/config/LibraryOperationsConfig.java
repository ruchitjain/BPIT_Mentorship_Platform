package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "library", locations = "classpath:sql/Library.yml")
public class LibraryOperationsConfig {

	private String getAllFileNamesFromLibrary;
	private String insertIntoLibrary;
	private String getLibraryIdAndFileNameForSearch;
	private String getFilePathFromLibraryId;
	private String getLibraryIdFileNameSemesterBranchTypeCourse;
	private String deleteFromLibrary;
	
	
	/**
	 * @return the deleteFromLibrary
	 */
	public String getDeleteFromLibrary() {
		return deleteFromLibrary;
	}
	/**
	 * @param deleteFromLibrary the deleteFromLibrary to set
	 */
	public void setDeleteFromLibrary(String deleteFromLibrary) {
		this.deleteFromLibrary = deleteFromLibrary;
	}
	/**
	 * @return the getLibraryIdFileNameSemesterBranchTypeCourse
	 */
	public String getGetLibraryIdFileNameSemesterBranchTypeCourse() {
		return getLibraryIdFileNameSemesterBranchTypeCourse;
	}
	/**
	 * @param getLibraryIdFileNameSemesterBranchTypeCourse the getLibraryIdFileNameSemesterBranchTypeCourse to set
	 */
	public void setGetLibraryIdFileNameSemesterBranchTypeCourse(
			String getLibraryIdFileNameSemesterBranchTypeCourse) {
		this.getLibraryIdFileNameSemesterBranchTypeCourse = getLibraryIdFileNameSemesterBranchTypeCourse;
	}
	/**
	 * @return the getAllFileNamesFromLibrary
	 */
	public String getGetAllFileNamesFromLibrary() {
		return getAllFileNamesFromLibrary;
	}
	/**
	 * @param getAllFileNamesFromLibrary the getAllFileNamesFromLibrary to set
	 */
	public void setGetAllFileNamesFromLibrary(String getAllFileNamesFromLibrary) {
		this.getAllFileNamesFromLibrary = getAllFileNamesFromLibrary;
	}
	/**
	 * @return the insertIntoLibrary
	 */
	public String getInsertIntoLibrary() {
		return insertIntoLibrary;
	}
	/**
	 * @param insertIntoLibrary the insertIntoLibrary to set
	 */
	public void setInsertIntoLibrary(String insertIntoLibrary) {
		this.insertIntoLibrary = insertIntoLibrary;
	}
	/**
	 * @return the getLibraryIdAndFileNameForSearch
	 */
	public String getGetLibraryIdAndFileNameForSearch() {
		return getLibraryIdAndFileNameForSearch;
	}
	/**
	 * @param getLibraryIdAndFileNameForSearch the getLibraryIdAndFileNameForSearch to set
	 */
	public void setGetLibraryIdAndFileNameForSearch(
			String getLibraryIdAndFileNameForSearch) {
		this.getLibraryIdAndFileNameForSearch = getLibraryIdAndFileNameForSearch;
	}
	/**
	 * @return the getFilePathFromLibraryId
	 */
	public String getGetFilePathFromLibraryId() {
		return getFilePathFromLibraryId;
	}
	/**
	 * @param getFilePathFromLibraryId the getFilePathFromLibraryId to set
	 */
	public void setGetFilePathFromLibraryId(String getFilePathFromLibraryId) {
		this.getFilePathFromLibraryId = getFilePathFromLibraryId;
	}
	
	
	

	
	
}
