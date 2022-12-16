package cs241;

public interface DecisionTreeInterface<T> extends BinaryTreeInterface<T> {
	public T getCurrentData();
	public void setCurrentData(T newData);
	public void setAnswers(T answerForNo, T answerForYes);
	public boolean isAnswer();
	public void advanceToNo();
	public void advanceToYes();
	public void reset();
}
