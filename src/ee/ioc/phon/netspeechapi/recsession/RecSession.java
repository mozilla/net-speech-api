/*
 * This file is part of Net Speech API.
 * Copyright 2011, Institute of Cybernetics at Tallinn University of Technology
 *
 * Net Speech API is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Net Speech API is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with ACE View.
 * If not, see http://www.gnu.org/licenses/.
 */

package ee.ioc.phon.netspeechapi.recsession;

import java.io.IOException;

public interface RecSession {

	void create() throws IOException, NotAvailableException;

	void sendChunk(byte[] bytes, boolean isLast) throws IOException;

	String getCurrentResult() throws IOException;

	boolean isFinished();

	void cancel();
}